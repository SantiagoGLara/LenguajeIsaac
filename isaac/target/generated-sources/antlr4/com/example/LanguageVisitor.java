// Generated from com\example\Language.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(LanguageParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(LanguageParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(LanguageParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(LanguageParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LanguageParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LanguageParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(LanguageParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LanguageParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(LanguageParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LanguageParser.FactorContext ctx);
}