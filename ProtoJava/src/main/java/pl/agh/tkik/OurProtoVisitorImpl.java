package pl.agh.tkik;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import pl.agh.tkik.antlr4.OurProtoBaseVisitor;
import pl.agh.tkik.antlr4.OurProtoParser;
import pl.agh.tkik.antlr4.OurProtoVisitor;

public class OurProtoVisitorImpl extends OurProtoBaseVisitor<String> {

    @Override
    public String visitProtoFileDef(OurProtoParser.ProtoFileDefContext ctx) {
        return super.visitProtoFileDef(ctx);
    }

    @Override
    public String visitSyntax(OurProtoParser.SyntaxContext ctx) {
        return super.visitSyntax(ctx);
    }

    @Override
    public String visitPackageDef(OurProtoParser.PackageDefContext ctx) {
        return super.visitPackageDef(ctx);
    }

    @Override
    public String visitFullIdentifier(OurProtoParser.FullIdentifierContext ctx) {
        return super.visitFullIdentifier(ctx);
    }

    @Override
    public String visitIdentifier(OurProtoParser.IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public String visitOption(OurProtoParser.OptionContext ctx) {
        return super.visitOption(ctx);
    }

    @Override
    public String visitOptionName(OurProtoParser.OptionNameContext ctx) {
        return super.visitOptionName(ctx);
    }

    @Override
    public String visitConstant(OurProtoParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public String visitIntLiteral(OurProtoParser.IntLiteralContext ctx) {
        return super.visitIntLiteral(ctx);
    }

    @Override
    public String visitFloatLiteral(OurProtoParser.FloatLiteralContext ctx) {
        return super.visitFloatLiteral(ctx);
    }

    @Override
    public String visitStrLiteral(OurProtoParser.StrLiteralContext ctx) {
        return super.visitStrLiteral(ctx);
    }

    @Override
    public String visitBoolLiteral(OurProtoParser.BoolLiteralContext ctx) {
        return super.visitBoolLiteral(ctx);
    }

    @Override
    public String visitDefinition(OurProtoParser.DefinitionContext ctx) {
        return super.visitDefinition(ctx);
    }

    @Override
    public String visitServiceDef(OurProtoParser.ServiceDefContext ctx) {
        return super.visitServiceDef(ctx);
    }

    @Override
    public String visitRpcDef(OurProtoParser.RpcDefContext ctx) {
        return super.visitRpcDef(ctx);
    }

    @Override
    public String visitMessageDef(OurProtoParser.MessageDefContext ctx) {
        return super.visitMessageDef(ctx);
    }

    @Override
    public String visitMessageBody(OurProtoParser.MessageBodyContext ctx) {
        return super.visitMessageBody(ctx);
    }

    @Override
    public String visitField(OurProtoParser.FieldContext ctx) {
        return super.visitField(ctx);
    }

    @Override
    public String visitFieldType(OurProtoParser.FieldTypeContext ctx) {
        return super.visitFieldType(ctx);
    }

    @Override
    public String visitType(OurProtoParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public String visitEnumDefinition(OurProtoParser.EnumDefinitionContext ctx) {
        return super.visitEnumDefinition(ctx);
    }

    @Override
    public String visitEnumBody(OurProtoParser.EnumBodyContext ctx) {
        return super.visitEnumBody(ctx);
    }

    @Override
    public String visitEnumField(OurProtoParser.EnumFieldContext ctx) {
        return super.visitEnumField(ctx);
    }

    @Override
    public String visitOneofDef(OurProtoParser.OneofDefContext ctx) {
        return super.visitOneofDef(ctx);
    }

    @Override
    public String visitOneOfField(OurProtoParser.OneOfFieldContext ctx) {
        return super.visitOneOfField(ctx);
    }

    @Override
    public String visitMapField(OurProtoParser.MapFieldContext ctx) {
        return super.visitMapField(ctx);
    }

    @Override
    public String visitKeyType(OurProtoParser.KeyTypeContext ctx) {
        return super.visitKeyType(ctx);
    }

    @Override
    public String visitEmptyStatement(OurProtoParser.EmptyStatementContext ctx) {
        return super.visitEmptyStatement(ctx);
    }

    @Override
    public String visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public String visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected String defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, String currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
