package com.example;

import java.util.HashMap;
import java.util.Map;

import com.example.LanguageParser.AsignacionContext;
import com.example.LanguageParser.BloqueContext;
import com.example.LanguageParser.CondicionalContext;
import com.example.LanguageParser.ExpresionContext;
import com.example.LanguageParser.FactorContext;
import com.example.LanguageParser.ForStmtContext;
import com.example.LanguageParser.IfStmtContext;
import com.example.LanguageParser.ImprimirContext;
import com.example.LanguageParser.InstruccionContext;
import com.example.LanguageParser.TerminoContext;

public class LanguageCustomVisitor extends LanguageBaseVisitor<Integer> {
    Map<String, Integer> simbolos = new HashMap<>();

    @Override
    public Integer visitInstruccion(InstruccionContext ctx) {
        Integer resultado = 0;
        if (ctx.asignacion() != null) resultado = visit(ctx.asignacion());
        else if (ctx.imprimir() != null) resultado = visit(ctx.imprimir());
        else if (ctx.condicional() != null) resultado = visit(ctx.condicional());
        else if (ctx.ifStmt() != null) resultado = visit(ctx.ifStmt());
        else if (ctx.expresion() != null) resultado = visit(ctx.expresion());
        else if (ctx.forStmt() != null) resultado = visit(ctx.forStmt());
        
        return resultado != null ? resultado : 0;
    }

    @Override
    public Integer visitCondicional(CondicionalContext ctx) {
        if (ctx.NOT() != null) return visit(ctx.condicional(0)) == 1 ? 0 : 1;
        
        if (ctx.DEMONDEAL() != null) // AND
            return (visit(ctx.condicional(0)) == 1 && visit(ctx.condicional(1)) == 1) ? 1 : 0;
        if (ctx.ANGELDEAL() != null) // OR
            return (visit(ctx.condicional(0)) == 1 || visit(ctx.condicional(1)) == 1) ? 1 : 0;

        int c1 = visit(ctx.expresion(0));
        int c2 = visit(ctx.expresion(1));
        String op = ctx.getChild(1).getText();

        if (op.equals("EQUALITY") || op.equals("==")) return c1 == c2 ? 1 : 0;
        switch (op) {
            case ">": return c1 > c2 ? 1 : 0;
            case "<": return c1 < c2 ? 1 : 0;
            default: return 0;
        }
    }

    @Override
    public Integer visitForStmt(ForStmtContext ctx) {
        visit(ctx.asignacion(0));
        Integer ultimoResultado = 0;
        
        while (visit(ctx.condicional()) == 1) {
            ultimoResultado = visit(ctx.bloque());
            visit(ctx.asignacion(1));
        }
        return ultimoResultado;
    }

    @Override
    public Integer visitExpresion(ExpresionContext ctx) {
        Integer resultado = visit(ctx.termino(0));
        for (int i = 1; i < ctx.termino().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
            if (operador.equals("BATTERY") || operador.equals("+")) {
                resultado += visit(ctx.termino(i));
            } else {
                resultado -= visit(ctx.termino(i));
            }
        }
        return resultado;
    }

    @Override
    public Integer visitBloque(BloqueContext ctx) {
        Integer resultado = 0;
        for (InstruccionContext instr : ctx.instruccion()) {
            resultado = visit(instr);
        }
        return resultado;
    }

    @Override
    public Integer visitAsignacion(AsignacionContext ctx) {
        String ident = ctx.WHITECARD().getText(); 
        int valor = (ctx.condicional() != null) ? visit(ctx.condicional()) : visit(ctx.expresion());
        simbolos.put(ident, valor);
        return valor;
    }

    @Override
    public Integer visitImprimir(ImprimirContext ctx) {
        if (ctx.RUNES() != null) { 
            String texto = ctx.RUNES().getText();
            System.out.println(texto.substring(1, texto.length() - 1));
            return 0;
        }
        int valor = (ctx.condicional() != null) ? visit(ctx.condicional()) : visit(ctx.expresion());
        System.out.println(ctx.condicional() != null ? (valor == 1 ? "true" : "false") : valor);
        return valor;
    }

    @Override
    public Integer visitIfStmt(IfStmtContext ctx) {
        if (visit(ctx.condicional(0)) == 1) return visit(ctx.bloque(0));
        for (int i = 1; i < ctx.condicional().size(); i++) {
            if (visit(ctx.condicional(i)) == 1) return visit(ctx.bloque(i));
        }
        if (ctx.PAYBACK() != null) return visit(ctx.bloque(ctx.bloque().size() - 1));
        return 0;
    }

    @Override
    public Integer visitTermino(TerminoContext ctx) {
        int resultado = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
            if (operador.equals("DIPLOPIA")) resultado *= visit(ctx.factor(i)); 
            else if (operador.equals("DIVORCEPAPERS")) { 
                int div = visit(ctx.factor(i));
                if (div == 0) return 0;
                resultado /= div;
            }
        }
        return resultado;
    }

    @Override
    public Integer visitFactor(FactorContext ctx) {
        if (ctx.CARDS() != null) return Integer.parseInt(ctx.CARDS().getText()); 
        if (ctx.WHITECARD() != null) return simbolos.getOrDefault(ctx.WHITECARD().getText(), 0);
        return visit(ctx.expresion());
    }
}