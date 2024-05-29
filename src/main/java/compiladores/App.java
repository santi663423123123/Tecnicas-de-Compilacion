package compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String fileName = "input/entrada.txt";
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            compiladoresLexer lexer = new compiladoresLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compiladoresParser parser = new compiladoresParser(tokens);
            ParseTree tree = parser.programa();
    
            System.out.println(tree.toStringTree(parser));

            Caminante2 visitor = new Caminante2();
            visitor.visit(tree);
            System.out.println(visitor);
            System.out.println(visitor.getErrorNodes());

            Escucha2 escucha = new Escucha2();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(escucha, tree);

  
            
        } catch (final IOException e) {
            System.err.println(e);
        }
    }
}



