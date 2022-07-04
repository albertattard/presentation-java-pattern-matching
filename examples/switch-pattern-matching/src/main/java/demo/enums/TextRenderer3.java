package demo.enums;

public class TextRenderer3 {

    public String render(final BinaryOperator3 operator) {
        return switch (operator) {
            case null     -> "";
            case ADD      -> "+";
            case SUBTRACT -> "-";
            case MULTIPLY -> "×";
            case DIVIDE   -> "÷";
        };
    }
}
