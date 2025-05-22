public class Elevator {

   private int  currentFloor = 1;
    private final int minFloor ;
    private final int maxFloor ;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("вы на: " + getCurrentFloor() + " этаже.");
    }

    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor ;
        System.out.println("вы на: " + getCurrentFloor() + " этаже.");
    }
    public void move(int floor){

        for (int i = currentFloor; i < floor; i++) {
            moveUp();
        }
        for (int i = currentFloor; i > floor; i--) {
            moveDown();
        }
    }

}
