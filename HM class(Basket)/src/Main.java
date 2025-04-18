public class Main {
    public static void main(String[] args) {
        Basket cupVol = new Basket();
        cupVol.appProduct("bread",1,1);
        System.out.println(cupVol.getProd() + cupVol.countProd() + cupVol.weithProd());
    }
}
