import syntaxtree.*;
import visitor.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        MiniJavaParser parser = new MiniJavaParser(new MiniJavaLexer(reader));

        parser.parse();
        parser.getGoal().accept(new PrettyPrintVisitor());
    }
}
