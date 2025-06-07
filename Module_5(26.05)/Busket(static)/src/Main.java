public class Main {
    public static void main(String[] args) {

        Basket cupVolod = new Basket();
        Basket cupVasya = new Basket();


        cupVolod.appProduct("хлеб",2,3,56);
        cupVolod.appProduct("молоко",4,2,65);
        cupVasya.appProduct("бананы",3,1,20);
        System.out.println("в корзине:" + cupVolod.getProdukt() + ", колличество товаров: " + cupVolod.getCountProdCup() +
                ", вес корзины: " + cupVolod.getTotalWeithCup());
        System.out.println("колличество используемых корзин:" + Basket.countBasket +
                ",колличество товаров в корзинах:" + Basket.getAllCountProductAllCup() + ",общаая стоймость товаров в корзинах:"
                + Basket.getAllPriceProductAllCup() + ",средняя цена товаров:" + Basket.getAveragePriceProduct());
    }
}
