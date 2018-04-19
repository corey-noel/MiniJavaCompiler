import syntaxtree.*;
import visitor.*;
import java.io.*;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String [] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        MiniJavaLexer lex = new MiniJavaLexer(reader);
        MiniJavaParser parser = new MiniJavaParser(lex);

        parser.parse();
        parser.getGoal().accept(new PrettyPrintVisitor());
    }
}
