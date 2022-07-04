package demo.enums;

public enum BinaryOperator3 {

    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public int execute(final int a, final int b) {
        return switch (this) {
            case ADD      -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE   -> a / b;
        };
    }
}
