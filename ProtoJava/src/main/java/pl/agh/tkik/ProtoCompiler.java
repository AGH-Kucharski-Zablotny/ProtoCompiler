package pl.agh.tkik;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import pl.agh.tkik.antlr4.OurProtoLexer;
import pl.agh.tkik.antlr4.OurProtoParser;
import pl.agh.tkik.antlr4.OurProtoVisitor;

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
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            OurProtoParser protoParser = new OurProtoParser(commonTokenStream);

            OurProtoParser.ProtoFileDefContext fileDefContext = protoParser.protoFileDef();
            OurProtoVisitor visitor = new OurProtoVisitorImpl();
            System.out.println(visitor.visit(fileDefContext));

        } catch (IOException e) {
            System.err.println("Error: File not found");
            System.exit(-2);
        }
    }
}
