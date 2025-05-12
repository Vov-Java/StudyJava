public class Basket {

    public int countGoodsCup;
    public int totalWeithCup;
    public String productNameCup = "";

    public void appProduct(String product, int countGoods, int weightProduct) {
        this.productNameCup = productNameCup.concat(product);
        this.totalWeithCup = totalWeithCup + (countGoods * weightProduct);
        this.countGoodsCup = countGoodsCup + countGoods;
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

//   public void appProduct(String product,int countProduct,int weithProduct){
//           this.product = product.concat(product);
//       this.totalWeith += weithProduct;
//       countGoods = countGoods + countProduct;

//   public String getProd (){
//       return product;
//   }
//   public int countPr (){
//       return countGoods;
//   }
//   public int weithPr (){
//       return totalWeith;
//   }

}
