package pl.agh.tkik.antlr4;// Generated from OurProto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OurProtoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OurProtoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#protoFileDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtoFileDef(OurProtoParser.ProtoFileDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(OurProtoParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#packageDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDef(OurProtoParser.PackageDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#fullIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIdentifier(OurProtoParser.FullIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OurProtoParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(OurProtoParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#optionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionName(OurProtoParser.OptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(OurProtoParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(OurProtoParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(OurProtoParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#strLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLiteral(OurProtoParser.StrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(OurProtoParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(OurProtoParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#serviceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDef(OurProtoParser.ServiceDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#rpcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpcDef(OurProtoParser.RpcDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#messageDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDef(OurProtoParser.MessageDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#messageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageBody(OurProtoParser.MessageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(OurProtoParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(OurProtoParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OurProtoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(OurProtoParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(OurProtoParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#enumField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumField(OurProtoParser.EnumFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#mapField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapField(OurProtoParser.MapFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#keyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyType(OurProtoParser.KeyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurProtoParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(OurProtoParser.EmptyStatementContext ctx);
}