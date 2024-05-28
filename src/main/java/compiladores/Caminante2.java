package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import java.util.ArrayList;
import java.util.List;

public class Caminante2 extends compiladoresBaseVisitor<Void> {
    private List<ParseTree> errorNodes = new ArrayList<>();

    @Override
    public Void visit(ParseTree tree) {
        super.visit(tree);
        // Realiza las operaciones necesarias aquí
        return null;
    }

    public List<ParseTree> getErrorNodes() {
        return errorNodes;
    }
}
