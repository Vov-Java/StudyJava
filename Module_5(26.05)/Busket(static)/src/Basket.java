public class Basket {

    private int countGoodsCup;
    private int totalWeithCup;
    private int priceProduct;
    private String productNameCup = "";
    private static int allPriceProductAllCup = 0;
    private static int allCountProductAllCup = 0;
    public static int countBasket = 0;

    public Basket(){
        countBasket++;
    }

    public void appProduct(String product, int countGoods, int weightProduct, int priceProduct) {
        this.productNameCup = productNameCup + product;
        this.totalWeithCup = totalWeithCup + (countGoods * weightProduct);
        this.countGoodsCup = countGoodsCup + countGoods;

       this.allCountProductAllCup = allCountProductAllCup + countGoods ;
       this.allPriceProductAllCup = allPriceProductAllCup + (countGoods * priceProduct);
    }
    public static double getAveragePriceProduct(){
       return allPriceProductAllCup / allCountProductAllCup;
    }
    public static int getAllPriceProductAllCup(){
        return allPriceProductAllCup;

    }
    public static int getAllCountProductAllCup(){
        return allCountProductAllCup;
    }

    public String getProdukt() {
        return productNameCup;
    }

    public int getCountProdCup() {
        return countGoodsCup;
    }

    public int getTotalWeithCup() {
        return totalWeithCup;
    }

    public int getCountBasket(){
        return countBasket;
    }

}
