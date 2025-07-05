public class Main {
    public static void main(String[] args) {

        Basket cupVolod = new Basket();
        Basket cupVasya = new Basket();

        cupVolod.appProduct("хлеб",2,3,56);
        cupVasya.appProduct("milk",5,4,50);


        System.out.println("в корзине:" + cupVolod.getProdukt() + ", колличество товаров: " + cupVolod.getCountProdCup() +
                ", вес корзины: " + cupVolod.getTotalWeithCup());

        System.out.println("колличество используемых корзин:" + Basket.getCountBasket() +
                ",колличество товаров в корзинах:" + Basket.getAllCountProductAllCup() + ",общаая стоймость товаров в корзинах:"
                + Basket.getAllPriceProductAllCup() + ",средняя цена товаров:" + Basket.getAveragePriceProduct());
    }
}
