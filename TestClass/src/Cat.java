public class Cat {
    private int weight = 5;
    private int totalWeight;

    public void meow(){
        weight = weight -1;
        System.out.println("MeoW ," + "weight = " + weight);
    }
    public void feed(int amount){
        weight = weight + amount;
        System.out.println("weight = " + weight);
    }
}

