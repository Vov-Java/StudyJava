public class Main {
    public static void main(String[] args) {

        Basket cupVolod = new Basket();
        cupVolod.appProduct("хлеб",2,3);
        cupVolod.appProduct("молоко",4,2);
        System.out.println("в корзине:" + cupVolod.getProdukt() + ", колличество товаров: " + cupVolod.getCountProdCup() +
                ", вес корзины: " + cupVolod.getTotalWeithCup());

//        cupVolod.appProduct("bread",3,1);
//        System.out.println(cupVolod.getProd() + cupVolod.countPr() + cupVolod.weithPr());
    }
}
