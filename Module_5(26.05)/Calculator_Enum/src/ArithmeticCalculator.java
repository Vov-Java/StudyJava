public class ArithmeticCalculator {
    private  int namberA = 0;
    private  int namberB = 0;

    public ArithmeticCalculator(int namberA, int namberB) {
        this.namberA = namberA;
        this.namberB = namberB;
    }
    public int calculate (Operation operation) {
        if (operation == Operation.ADD) {
            return namberA + namberB;
        } else if (operation == Operation.SUBTRACT) {
            return namberA - namberB;
        } else if (operation == Operation.MULTIPLY) {
            return namberA * namberB;
        }

    }
}
