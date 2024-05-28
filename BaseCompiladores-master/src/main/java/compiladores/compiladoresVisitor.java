// Generated from g:/Programming/Programs/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(compiladoresParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inicializar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializar(compiladoresParser.InicializarContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIds(compiladoresParser.ListaIdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(compiladoresParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(compiladoresParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(compiladoresParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparar(compiladoresParser.CompararContext ctx);
}