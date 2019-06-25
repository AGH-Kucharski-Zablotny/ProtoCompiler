package pl.agh.tkik;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.agh.tkik.antlr4.OurProtoLexer;
import pl.agh.tkik.antlr4.OurProtoParser;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Main compiler class
 */
public class ProtoCompiler {

    /**
     * Main program, file to be compiled should be provided in program startup args
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Error: No file path given in argument");
            System.exit(-1);
        }
        Path filePath = Paths.get(args[0]);
        try {
            CharStream inputFile = CharStreams.fromPath(filePath);
            OurProtoLexer lexer = new OurProtoLexer(inputFile);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OurProtoParser protoParser = new OurProtoParser(tokens);

            ParseTree tree = protoParser.protoFileDef();
            ParseTreeWalker walker = new ParseTreeWalker();
            ProtobufListener listener = new ProtobufListener();
            walker.walk(listener, tree);

            System.out.println(listener.getResult());

        } catch (IOException e) {
            System.err.println("Error: File not found");
            System.exit(-2);
        }
    }
}
