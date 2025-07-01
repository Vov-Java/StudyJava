public class ArithmeticCalculator {
    private int numberA = 0;
    private int numberB = 0;
    private int defolt =00000;

    public ArithmeticCalculator(int namberA, int namberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return numberA + numberB;
        } else if (operation == Operation.SUBTRACT) {
            return numberA - numberB;
        } else if (operation == Operation.MULTIPLY) {
            return numberA * numberB;
        }else {
            System.out.println("не понимаю");
        }return defolt;


    }
}
