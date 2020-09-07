package com.cral;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        String jsonContent = new String(Files.readAllBytes(Paths.get("src/main/resources/global.json")));
        JSONGrammerLexer lexer = new JSONGrammerLexer(CharStreams.fromString(jsonContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONGrammerParser parser = new JSONGrammerParser(tokens);


        ParseCustomListener listener = new ParseCustomListener();
        parser.addParseListener(listener);
        parser.json();
        System.out.println(listener.getIndex().get("error.file.could.not.extract"));

    }

    public static class ParseCustomListener implements JSONGrammerListener {
        Map<String, Integer> index = new HashMap<>();
        Stack<String> accumulator = new Stack<>();

        public Map<String, Integer> getIndex() {
            return index;
        }

        @Override
        public void enterJson(JSONGrammerParser.JsonContext ctx) {

        }

        @Override
        public void exitJson(JSONGrammerParser.JsonContext ctx) {
        }

        @Override
        public void enterObj(JSONGrammerParser.ObjContext ctx) {
        }

        @Override
        public void exitObj(JSONGrammerParser.ObjContext ctx) {
        }

        @Override
        public void enterPair(JSONGrammerParser.PairContext ctx) {
            String text = ctx.getStart().getText().replace("\"", "");
            accumulator.add(text);
            String join = String.join(".", accumulator);
            System.out.println(join);
            index.put(join, ctx.getStart().getLine());
        }

        @Override
        public void exitPair(JSONGrammerParser.PairContext ctx) {
            accumulator.pop();
        }

        @Override
        public void enterArr(JSONGrammerParser.ArrContext ctx) {

        }

        @Override
        public void exitArr(JSONGrammerParser.ArrContext ctx) {

        }

        @Override
        public void enterValue(JSONGrammerParser.ValueContext ctx) {
        }

        @Override
        public void exitValue(JSONGrammerParser.ValueContext ctx) {
        }

        @Override
        public void visitTerminal(TerminalNode terminalNode) {

        }

        @Override
        public void visitErrorNode(ErrorNode errorNode) {

        }

        @Override
        public void enterEveryRule(ParserRuleContext parserRuleContext) {

        }

        @Override
        public void exitEveryRule(ParserRuleContext parserRuleContext) {

        }
    }
}
