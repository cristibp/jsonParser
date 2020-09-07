package com.cral;// Generated from JSONGrammer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONGrammerParser}.
 */
public interface JSONGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONGrammerParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONGrammerParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGrammerParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONGrammerParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGrammerParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONGrammerParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGrammerParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONGrammerParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGrammerParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONGrammerParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGrammerParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONGrammerParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGrammerParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(JSONGrammerParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGrammerParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(JSONGrammerParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGrammerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONGrammerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGrammerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONGrammerParser.ValueContext ctx);
}