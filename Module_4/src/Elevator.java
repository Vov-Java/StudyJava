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
    }
    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor ;
    }
    public void move(int floor){
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("ошибка");
        }else { currentFloor = floor;
            System.out.println("двери закрываются,едем на : " + floor);
        }


    }

}
