package pl.agh.tkik;

import pl.agh.tkik.antlr4.OurProtoBaseListener;
import pl.agh.tkik.antlr4.OurProtoParser;

public class ProtobufListener extends OurProtoBaseListener {

    private StringBuilder compiledFileBuilder = new StringBuilder();

    private boolean isRepeatedField = false;

    public String getResult() {
        return compiledFileBuilder.toString();
    }

    @Override
    public void enterPackageDef(OurProtoParser.PackageDefContext ctx) {
        compiledFileBuilder.append("package ");
    }

    @Override
    public void exitPackageDef(OurProtoParser.PackageDefContext ctx) {
        compiledFileBuilder.append(";\n");
    }

    @Override
    public void enterFullIdentifier(OurProtoParser.FullIdentifierContext ctx) {
        if (ctx.getParent().getClass() != OurProtoParser.RpcDefContext.class) {
            compiledFileBuilder.append(ctx.getText());
        }
    }

    @Override
    public void enterIdentifier(OurProtoParser.IdentifierContext ctx) {
        if (ctx.getParent().getClass() != OurProtoParser.FullIdentifierContext.class
                && ctx.getParent().getClass() != OurProtoParser.RpcDefContext.class) {
            compiledFileBuilder.append(ctx.getText());
        }
    }

    @Override
    public void exitIdentifier(OurProtoParser.IdentifierContext ctx) {
        if (ctx.getParent().getClass() == OurProtoParser.ServiceDefContext.class) {
            compiledFileBuilder.append("{\n");
        }
    }

    @Override
    public void enterMessageDef(OurProtoParser.MessageDefContext ctx) {
        compiledFileBuilder.append("class ");
    }

    @Override
    public void exitMessageDef(OurProtoParser.MessageDefContext ctx) {
        compiledFileBuilder.append("\n");
    }

    @Override
    public void enterMessageBody(OurProtoParser.MessageBodyContext ctx) {
        compiledFileBuilder.append(" ").append(ctx.LCBRA().getText()).append("\n");
    }

    @Override
    public void exitMessageBody(OurProtoParser.MessageBodyContext ctx) {
        compiledFileBuilder.append("\n").append(ctx.RCBRA().getText()).append("\n");
    }

    @Override
    public void enterField(OurProtoParser.FieldContext ctx) {
        compiledFileBuilder.append("private ");
    }

    @Override
    public void exitField(OurProtoParser.FieldContext ctx) {
        compiledFileBuilder.append(";\n");

        String fieldName = ctx.identifier().getText();
        String methodFieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

        appendGetter(ctx, fieldName, methodFieldName);
        appendSetter(ctx, fieldName, methodFieldName);
    }

    private void appendGetter(OurProtoParser.FieldContext ctx, String fieldName, String methodFieldName) {
        appendFieldType(ctx);
        compiledFileBuilder.append("get")
                .append(methodFieldName)
                .append("() { return ")
                .append(fieldName)
                .append("; }\n");
    }

    private void appendSetter(OurProtoParser.FieldContext ctx, String fieldName, String methodFieldName) {
        compiledFileBuilder.append("void set")
                .append(methodFieldName)
                .append("(");
        appendFieldType(ctx);
        compiledFileBuilder.append("item) { this.")
                .append(fieldName)
                .append(" = item; }\n\n");
    }

    private void appendFieldType(OurProtoParser.FieldContext ctx) {
        enterFieldType(ctx.fieldType());
        if (ctx.fieldType().fullIdentifier() == null) {
            enterType(ctx.fieldType().type());
            exitType(ctx.fieldType().type());
        }
        else {
            enterFullIdentifier(ctx.fieldType().fullIdentifier());
            exitFullIdentifier(ctx.fieldType().fullIdentifier());
        }
        exitFieldType(ctx.fieldType());
    }

    @Override
    public void enterFieldType(OurProtoParser.FieldTypeContext ctx) {
        if (((OurProtoParser.FieldContext) ctx.getParent()).REPEATED() != null) {
            compiledFileBuilder.append("java.util.List<");
            isRepeatedField = true;
        }
    }

    @Override
    public void exitFieldType(OurProtoParser.FieldTypeContext ctx) {
        if (isRepeatedField) {
            compiledFileBuilder.append("> ");
            isRepeatedField = false;
        }
        else {
            compiledFileBuilder.append(" ");
        }
    }

    @Override
    public void enterType(OurProtoParser.TypeContext ctx) {
        if (ctx.DOUBLE() != null) {
            compiledFileBuilder.append("Double");
        }
        if (ctx.FLOAT() != null) {
            compiledFileBuilder.append("Float");
        }
        if (ctx.INT32() != null || ctx.UINT32() != null || ctx.SINT32() != null
                || ctx.FIXED32() != null || ctx.SFIXED32()!= null ) {
            compiledFileBuilder.append("Integer");
        }
        if (ctx.INT64() != null || ctx.UINT64() != null || ctx.SINT64()!= null
                || ctx.FIXED64() != null || ctx.SFIXED64() != null) {
            compiledFileBuilder.append("Long");
        }
        if (ctx.BOOL() != null) {
            compiledFileBuilder.append("Boolean");
        }
        if (ctx.STRING() != null || ctx.BYTE() != null) {
            compiledFileBuilder.append("String");
        }
    }

    @Override
    public void exitType(OurProtoParser.TypeContext ctx) {
        if (ctx.getParent().getClass() == OurProtoParser.MapFieldContext.class) {
            compiledFileBuilder.append("> ");
        }
    }

    @Override
    public void enterMapField(OurProtoParser.MapFieldContext ctx) {
        compiledFileBuilder.append("java.util.Map<");
    }

    @Override
    public void exitMapField(OurProtoParser.MapFieldContext ctx) {
        compiledFileBuilder.append(";\n");

        String fieldName = ctx.identifier().getText();
        String methodFieldName = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);

        compiledFileBuilder.append("public java.util.Map<");
        enterKeyType(ctx.keyType());
        exitKeyType(ctx.keyType());
        compiledFileBuilder.append("get")
                .append(methodFieldName)
                .append("() { return this.")
                .append(fieldName)
                .append("; }\n");

        compiledFileBuilder.append("public void set")
                .append(methodFieldName)
                .append("(");
        enterKeyType(ctx.keyType());
        exitKeyType(ctx.keyType());
        compiledFileBuilder.append("item { this.")
                .append(fieldName)
                .append(" = item; }\n\n");
    }

    @Override
    public void enterKeyType(OurProtoParser.KeyTypeContext ctx) {
        if (ctx.INT32() != null || ctx.UINT32() != null || ctx.SINT32() != null
                || ctx.FIXED32() != null || ctx.SFIXED32()!= null ) {
            compiledFileBuilder.append("Integer");
        }
        if (ctx.INT64() != null || ctx.UINT64() != null || ctx.SINT64()!= null
                || ctx.FIXED64() != null || ctx.SFIXED64() != null) {
            compiledFileBuilder.append("Long");
        }
        if (ctx.BOOL() != null) {
            compiledFileBuilder.append("Boolean");
        }
        if (ctx.STRING() != null) {
            compiledFileBuilder.append("String");
        }
    }

    @Override
    public void exitKeyType(OurProtoParser.KeyTypeContext ctx) {
        compiledFileBuilder.append(", ");
    }

    @Override
    public void enterServiceDef(OurProtoParser.ServiceDefContext ctx) {
        compiledFileBuilder.append("interface ");
    }

    @Override
    public void exitServiceDef(OurProtoParser.ServiceDefContext ctx) {
        compiledFileBuilder.append("}\n");
    }

    @Override
    public void enterRpcDef(OurProtoParser.RpcDefContext ctx) {
        compiledFileBuilder.append(ctx.fullIdentifier(1).getText())
                .append(" ")
                .append(ctx.identifier().getText())
                .append("(")
                .append(ctx.fullIdentifier(0).getText())
                .append(" request)");
    }

    @Override
    public void exitRpcDef(OurProtoParser.RpcDefContext ctx) {
        compiledFileBuilder.append(";\n");
    }
}
