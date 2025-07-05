public class Basket {

  private int countGoodsCup;
    private int totalWeithCup;
    private int priceProduct;
    private String productNameCup = "";
    private static int allPriceProductAllCup = 0;
    private static int allCountProductAllCup = 0;
    private static int countBasket = 0;

    public Basket(){
        countBasket++;
    }

    public void appProduct(String product, int countGoods, int weightProduct, int priceProduct) {
        this.productNameCup = productNameCup + product;
        this.totalWeithCup = totalWeithCup + (countGoods * weightProduct);
        this.countGoodsCup = countGoodsCup + countGoods;

        Basket.allPriceMathod(countGoods,priceProduct);
        Basket.allCountProductMethod(countGoodsCup);

//       this.allCountProductAllCup = allCountProductAllCup + countGoods ;
//       this.allPriceProductAllCup = allPriceProductAllCup + (countGoods * priceProduct);
    }
    public static void allCountProductMethod(int countGoodsCup){
        allCountProductAllCup = allCountProductAllCup + countGoodsCup;
    }
    public static void allPriceMathod(int countGoods,int priceProduct){
        allPriceProductAllCup =+ countGoods * priceProduct;
    }
    public static int getTotalCount() {
        return allCountProductAllCup;
    }

    public static int getTotalPrice() {
        return allPriceProductAllCup;
    }


    public static double getAveragePriceProduct(){
        if (allCountProductAllCup == 0){
       return 0.0;
        } else {
        return  allPriceProductAllCup/allCountProductAllCup;}
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

    public static int getCountBasket(){
        return countBasket;
    }

}
