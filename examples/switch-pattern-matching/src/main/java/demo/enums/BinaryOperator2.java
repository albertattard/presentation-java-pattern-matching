package demo.enums;

public enum BinaryOperator2 {

    ADD {
        @Override
        public int execute(final int a, final int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int execute(final int a, final int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int execute(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int execute(int a, int b) {
            return a / b;
        }
    };

    public abstract int execute(final int a, final int b);
}
