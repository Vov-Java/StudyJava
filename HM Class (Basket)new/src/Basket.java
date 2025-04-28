public class Basket {

    public int countGoodsCup;
    public int totalWeithCup;
    public String productNameCup = "";

    public void appProduct(String product,int countGoods,int weightProduct){
        countGoodsCup = countGoodsCup + countGoods;
        totalWeithCup = totalWeithCup + (weightProduct * countGoods);
        System.out.println(" in Cup:" +countGoodsCup + product  + "weight cup = " + totalWeithCup);
    }

//   public void appProduct(String product,int countProduct,int weithProduct){
//       this.product = product.concat(product);
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
