package demo.enums;

public class TextRenderer1 {

    public String render(final BinaryOperator1 operator) {
        if (operator == null) {
            return "";
        }

        switch (operator) {
            case ADD:      return "+";
            case SUBTRACT: return "-";
            case MULTIPLY: return "×";
            case DIVIDE:   return "÷";
        }

        throw new RuntimeException("Unknown operator");
    }
}
