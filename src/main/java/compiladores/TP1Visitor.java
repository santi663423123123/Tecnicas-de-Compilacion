// Generated from c:/Users/Usuario/Downloads/BaseCompiladores-master/src/main/java/compiladores/TP1.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TP1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TP1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#tipoinstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoinstruccion(TP1Parser.TipoinstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(TP1Parser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(TP1Parser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#declaracionVariablelarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariablelarar(TP1Parser.DeclaracionVariablelararContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#inicializar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializar(TP1Parser.InicializarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(TP1Parser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(TP1Parser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#definicionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionFuncion(TP1Parser.DefinicionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#parametrosdefuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosdefuncion(TP1Parser.ParametrosdefuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(TP1Parser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(TP1Parser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(TP1Parser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#ipara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpara(TP1Parser.IparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#comparar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparar(TP1Parser.CompararContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TP1Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TP1Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TP1Parser.ExpContext ctx);
}