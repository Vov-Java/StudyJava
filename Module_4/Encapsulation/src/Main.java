import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3,26);
        elevator.moveUp();
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();

        while (true){
            System.out.println("введите этаж: ");
            int fllor = new Scanner(System.in).nextInt();
            elevator.move(fllor);

            System.out.println("вы на: " + elevator.getCurrentFloor() + " этаже.");
        }

    }

}
