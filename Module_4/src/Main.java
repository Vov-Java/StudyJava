import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3,26);
               System.out.println(elevator.getCurrentFloor());
        elevator.moveUp();
        System.out.println(elevator.getCurrentFloor());
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();
        elevator.moveDown();
        System.out.println(elevator.getCurrentFloor());

        while (true){
            System.out.println("введите этаж: ");
            int fllor = new Scanner(System.in).nextInt();
            elevator.move(fllor);
        }

    }

}
