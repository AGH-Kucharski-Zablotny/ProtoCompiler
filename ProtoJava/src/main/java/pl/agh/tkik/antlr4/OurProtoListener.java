package pl.agh.tkik.antlr4;// Generated from OurProto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OurProtoParser}.
 */
public interface OurProtoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#protoFileDef}.
	 * @param ctx the parse tree
	 */
	void enterProtoFileDef(OurProtoParser.ProtoFileDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#protoFileDef}.
	 * @param ctx the parse tree
	 */
	void exitProtoFileDef(OurProtoParser.ProtoFileDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(OurProtoParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(OurProtoParser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#packageDef}.
	 * @param ctx the parse tree
	 */
	void enterPackageDef(OurProtoParser.PackageDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#packageDef}.
	 * @param ctx the parse tree
	 */
	void exitPackageDef(OurProtoParser.PackageDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFullIdentifier(OurProtoParser.FullIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFullIdentifier(OurProtoParser.FullIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OurProtoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OurProtoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(OurProtoParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(OurProtoParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#optionName}.
	 * @param ctx the parse tree
	 */
	void enterOptionName(OurProtoParser.OptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#optionName}.
	 * @param ctx the parse tree
	 */
	void exitOptionName(OurProtoParser.OptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OurProtoParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OurProtoParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(OurProtoParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(OurProtoParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(OurProtoParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(OurProtoParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStrLiteral(OurProtoParser.StrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStrLiteral(OurProtoParser.StrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(OurProtoParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(OurProtoParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(OurProtoParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(OurProtoParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void enterServiceDef(OurProtoParser.ServiceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void exitServiceDef(OurProtoParser.ServiceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#rpcDef}.
	 * @param ctx the parse tree
	 */
	void enterRpcDef(OurProtoParser.RpcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#rpcDef}.
	 * @param ctx the parse tree
	 */
	void exitRpcDef(OurProtoParser.RpcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#messageDef}.
	 * @param ctx the parse tree
	 */
	void enterMessageDef(OurProtoParser.MessageDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#messageDef}.
	 * @param ctx the parse tree
	 */
	void exitMessageDef(OurProtoParser.MessageDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void enterMessageBody(OurProtoParser.MessageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void exitMessageBody(OurProtoParser.MessageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(OurProtoParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(OurProtoParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(OurProtoParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(OurProtoParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OurProtoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OurProtoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(OurProtoParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(OurProtoParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(OurProtoParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(OurProtoParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(OurProtoParser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(OurProtoParser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#oneofDef}.
	 * @param ctx the parse tree
	 */
	void enterOneofDef(OurProtoParser.OneofDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#oneofDef}.
	 * @param ctx the parse tree
	 */
	void exitOneofDef(OurProtoParser.OneofDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#oneOfField}.
	 * @param ctx the parse tree
	 */
	void enterOneOfField(OurProtoParser.OneOfFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#oneOfField}.
	 * @param ctx the parse tree
	 */
	void exitOneOfField(OurProtoParser.OneOfFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#mapField}.
	 * @param ctx the parse tree
	 */
	void enterMapField(OurProtoParser.MapFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#mapField}.
	 * @param ctx the parse tree
	 */
	void exitMapField(OurProtoParser.MapFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#keyType}.
	 * @param ctx the parse tree
	 */
	void enterKeyType(OurProtoParser.KeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#keyType}.
	 * @param ctx the parse tree
	 */
	void exitKeyType(OurProtoParser.KeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurProtoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(OurProtoParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurProtoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(OurProtoParser.EmptyStatementContext ctx);
}