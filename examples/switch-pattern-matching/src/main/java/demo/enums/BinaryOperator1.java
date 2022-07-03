package demo.enums;

public enum BinaryOperator1 {

    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public int execute(final int a, final int b) {
        switch (this) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
        }

        throw new RuntimeException("Unknown operator");
    }
}
