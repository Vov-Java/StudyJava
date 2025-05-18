public class Elevator {

    public int currentFloor = 1;
    public int minFloor ;
    public int maxFloor ;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor -- : currentFloor;
    }
    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor ++ : currentFloor ;
    }
    public void move(int floor){
        if (floor < minFloor && floor > maxFloor) {
            System.out.println("ошибка");
        }else {
            System.out.println("двери закрываются,едем на : " + floor);
        }


    }

}
