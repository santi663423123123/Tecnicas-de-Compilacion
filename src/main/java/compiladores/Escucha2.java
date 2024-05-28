package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Escucha2 extends compiladoresBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // Implementa las acciones necesarias aquí
        System.out.println("Entering rule: " + ctx.getText());
    }
}
