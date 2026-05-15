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

public class LanguageCustomVisitor extends LanguageBaseVisitor<Object> {
    
    // Fase 3: Uso de clase Simbolo para guardar valor y tipo
    Map<String, Simbolo> tablaSimbolos = new HashMap<>();

    // Método auxiliar para reportar errores con la línea exacta (Fase 4)
    private void reportarError(String mensaje, int linea) {
        System.err.println("Error semántico (línea " + linea + "): " + mensaje);
    }

    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        Object resultado = 0;
        if (ctx.asignacion() != null) resultado = visit(ctx.asignacion());
        else if (ctx.imprimir() != null) resultado = visit(ctx.imprimir());
        else if (ctx.condicional() != null) resultado = visit(ctx.condicional());
        else if (ctx.ifStmt() != null) resultado = visit(ctx.ifStmt());
        else if (ctx.expresion() != null) resultado = visit(ctx.expresion());
        else if (ctx.forStmt() != null) resultado = visit(ctx.forStmt());
        
        return resultado != null ? resultado : 0;
    }

    @Override
    public Object visitCondicional(CondicionalContext ctx) {
        if (ctx.NOT() != null) return (Integer) visit(ctx.condicional(0)) == 1 ? 0 : 1;
        
        if (ctx.DEMONDEAL() != null) 
            return ((Integer) visit(ctx.condicional(0)) == 1 && (Integer) visit(ctx.condicional(1)) == 1) ? 1 : 0;
        if (ctx.ANGELDEAL() != null) 
            return ((Integer) visit(ctx.condicional(0)) == 1 || (Integer) visit(ctx.condicional(1)) == 1) ? 1 : 0;

        Object obj1 = visit(ctx.expresion(0));
        Object obj2 = visit(ctx.expresion(1));
        
        // Validación semántica: Solo se pueden comparar números
        if (!(obj1 instanceof Integer) || !(obj2 instanceof Integer)) {
            reportarError("tipos incompatibles en condición (se esperaban números)", ctx.start.getLine());
            return 0; // Falso por defecto en caso de error
        }

        int c1 = (Integer) obj1;
        int c2 = (Integer) obj2;
        String op = ctx.getChild(1).getText();

        if (op.equals("EQUALITY") || op.equals("==")) return c1 == c2 ? 1 : 0;
        switch (op) {
            case ">": return c1 > c2 ? 1 : 0;
            case "<": return c1 < c2 ? 1 : 0;
            default: return 0;
        }
    }

    @Override
    public Object visitForStmt(ForStmtContext ctx) {
        visit(ctx.asignacion(0));
        Object ultimoResultado = 0;
        
        // Condición debe evaluar a 1 (verdadero)
        while ((Integer) visit(ctx.condicional()) == 1) {
            ultimoResultado = visit(ctx.bloque());
            visit(ctx.asignacion(1));
        }
        return ultimoResultado;
    }

    @Override
    public Object visitExpresion(ExpresionContext ctx) {
        Object resInicial = visit(ctx.termino(0));
        
        // Verificamos que el primer término sea un número
        if (!(resInicial instanceof Integer)) {
            reportarError("tipos incompatibles: no se puede realizar suma/resta con texto", ctx.start.getLine());
            return 0;
        }
        
        Integer resultado = (Integer) resInicial;
        for (int i = 1; i < ctx.termino().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
            Object resSiguiente = visit(ctx.termino(i));
            
            // Verificamos que los siguientes términos sean números
            if (!(resSiguiente instanceof Integer)) {
                reportarError("tipos incompatibles: no se puede realizar suma/resta con texto", ctx.start.getLine());
                continue;
            }
            
            if (operador.equals("BATTERY") || operador.equals("+")) {
                resultado += (Integer) resSiguiente;
            } else {
                resultado -= (Integer) resSiguiente;
            }
        }
        return resultado;
    }

    @Override
    public Object visitTermino(TerminoContext ctx) {
        Object resInicial = visit(ctx.factor(0));
        
        if (!(resInicial instanceof Integer)) {
            reportarError("tipos incompatibles: no se puede multiplicar/dividir texto", ctx.start.getLine());
            return 0;
        }

        int resultado = (Integer) resInicial;
        for (int i = 1; i < ctx.factor().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
            Object resSiguiente = visit(ctx.factor(i));
            
            if (!(resSiguiente instanceof Integer)) {
                reportarError("tipos incompatibles: no se puede multiplicar/dividir texto", ctx.start.getLine());
                continue;
            }
            
            int div = (Integer) resSiguiente;
            if (operador.equals("DIPLOPIA")) {
                resultado *= div; 
            } else if (operador.equals("DIVORCEPAPERS")) { 
                // Validación semántica: División por cero
                if (div == 0) {
                    reportarError("división entre cero no válida", ctx.start.getLine());
                    return 0; // Evitamos que truene Java y retornamos 0
                }
                resultado /= div;
            }
        }
        return resultado;
    }

    @Override
    public Object visitFactor(FactorContext ctx) {
        if (ctx.CARDS() != null) return Integer.parseInt(ctx.CARDS().getText()); 
        
        if (ctx.WHITECARD() != null) {
            String nombreVar = ctx.WHITECARD().getText();
            
            // Validación semántica: Variable no declarada
            if (!tablaSimbolos.containsKey(nombreVar)) {
                reportarError("variable '" + nombreVar + "' no declarada", ctx.start.getLine());
                return 0; 
            }
            return tablaSimbolos.get(nombreVar).valor;
        }
        return visit(ctx.expresion());
    }

    @Override
public Object visitAsignacion(AsignacionContext ctx) {
    String ident = ctx.WHITECARD().getText(); 
    String tipoDeclarado = ctx.T_ID().getText(); // Extrae "CARDS", "RUNES" o "PILLS"
    
    Object valor = (ctx.condicional() != null) ? visit(ctx.condicional()) : visit(ctx.expresion());
    
    // Determinar el tipo real del valor que se está intentando guardar
    String tipoValor = (valor instanceof Integer) ? "CARDS" : "RUNES";
    
    // VALIDACIÓN SEMÁNTICA: Tipos de datos compatibles
    if (!tipoDeclarado.equals(tipoValor)) {
        reportarError("tipo de dato incompatible. Se declaró como " + tipoDeclarado + 
                      ", pero se le asignó un valor tipo " + tipoValor, ctx.start.getLine());
        return 0; // Valor de contingencia
    }
    
    // Guardamos la variable en la tabla de símbolos
    tablaSimbolos.put(ident, new Simbolo(tipoDeclarado, valor));
    return valor;
}

    @Override
    public Object visitImprimir(ImprimirContext ctx) {
        if (ctx.RUNES() != null) { 
            String texto = ctx.RUNES().getText();
            System.out.println(texto.substring(1, texto.length() - 1));
            return null;
        }
        Object valor = (ctx.condicional() != null) ? visit(ctx.condicional()) : visit(ctx.expresion());
        
        if (valor instanceof Integer && ctx.condicional() != null) {
            System.out.println((Integer) valor == 1 ? "true" : "false");
        } else {
            System.out.println(valor);
        }
        return valor;
    }

    @Override
    public Object visitIfStmt(IfStmtContext ctx) {
        if ((Integer) visit(ctx.condicional(0)) == 1) return visit(ctx.bloque(0));
        for (int i = 1; i < ctx.condicional().size(); i++) {
            if ((Integer) visit(ctx.condicional(i)) == 1) return visit(ctx.bloque(i));
        }
        if (ctx.PAYBACK() != null) return visit(ctx.bloque(ctx.bloque().size() - 1));
        return 0;
    }
    
    @Override
    public Object visitBloque(BloqueContext ctx) {
        Object resultado = 0;
        for (InstruccionContext instr : ctx.instruccion()) {
            resultado = visit(instr);
        }
        return resultado;
    }
}