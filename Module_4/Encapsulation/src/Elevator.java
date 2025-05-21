public class Elevator {

   public int currentFloor = 1;
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
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("ошибка");
            currentFloor = currentFloor;

        } else if (getCurrentFloor() < floor){
            for (int i = getCurrentFloor(); i <= floor; i++) {
                System.out.println("поднимаемся - " + i);
            }currentFloor = floor;


        }else if (getCurrentFloor() > floor){
            for (int i = getCurrentFloor(); i >= floor ; i--) {
                System.out.println("спускаемся - " + i);
            }
        }currentFloor = floor;

    }

}
