// Generated from g:/Programming/Programs/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(compiladoresParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(compiladoresParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inicializar}.
	 * @param ctx the parse tree
	 */
	void enterInicializar(compiladoresParser.InicializarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inicializar}.
	 * @param ctx the parse tree
	 */
	void exitInicializar(compiladoresParser.InicializarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void enterListaIds(compiladoresParser.ListaIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void exitListaIds(compiladoresParser.ListaIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(compiladoresParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(compiladoresParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(compiladoresParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(compiladoresParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(compiladoresParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(compiladoresParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparar}.
	 * @param ctx the parse tree
	 */
	void enterComparar(compiladoresParser.CompararContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparar}.
	 * @param ctx the parse tree
	 */
	void exitComparar(compiladoresParser.CompararContext ctx);
}