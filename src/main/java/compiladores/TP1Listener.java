// Generated from c:/Users/Usuario/Downloads/BaseCompiladores-master/src/main/java/compiladores/TP1.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TP1Parser}.
 */
public interface TP1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#tipoinstruccion}.
	 * @param ctx the parse tree
	 */
	void enterTipoinstruccion(TP1Parser.TipoinstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#tipoinstruccion}.
	 * @param ctx the parse tree
	 */
	void exitTipoinstruccion(TP1Parser.TipoinstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(TP1Parser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(TP1Parser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(TP1Parser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(TP1Parser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#declaracionVariablelarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariablelarar(TP1Parser.DeclaracionVariablelararContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#declaracionVariablelarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariablelarar(TP1Parser.DeclaracionVariablelararContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#inicializar}.
	 * @param ctx the parse tree
	 */
	void enterInicializar(TP1Parser.InicializarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#inicializar}.
	 * @param ctx the parse tree
	 */
	void exitInicializar(TP1Parser.InicializarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(TP1Parser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(TP1Parser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(TP1Parser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(TP1Parser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion(TP1Parser.DefinicionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion(TP1Parser.DefinicionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#parametrosdefuncion}.
	 * @param ctx the parse tree
	 */
	void enterParametrosdefuncion(TP1Parser.ParametrosdefuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#parametrosdefuncion}.
	 * @param ctx the parse tree
	 */
	void exitParametrosdefuncion(TP1Parser.ParametrosdefuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(TP1Parser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(TP1Parser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(TP1Parser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(TP1Parser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(TP1Parser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(TP1Parser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#ipara}.
	 * @param ctx the parse tree
	 */
	void enterIpara(TP1Parser.IparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#ipara}.
	 * @param ctx the parse tree
	 */
	void exitIpara(TP1Parser.IparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#comparar}.
	 * @param ctx the parse tree
	 */
	void enterComparar(TP1Parser.CompararContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#comparar}.
	 * @param ctx the parse tree
	 */
	void exitComparar(TP1Parser.CompararContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TP1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TP1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TP1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TP1Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TP1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TP1Parser.ExpContext ctx);
}