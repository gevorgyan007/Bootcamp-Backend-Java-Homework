package com.company.TaskDay16_OOP;

public class Shop {
    //Has a fields name, address, countOfProduct,
    //priceForProduct, shopBalance.
    public    String name ;
    String address ;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;
    public  Shop(){};
    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance ;
    }
  public boolean  checkOrder(int product){
        if (product > countOfProduct ) {
            System.out.println("do not have this count of product");
            return false;
        }
        else
            System.out.println("We this count of product");
        return true;
  }
   public int  calculateOrder(int praduct){
        return praduct * priceForProduct;
   }
   public int addToShopBalance(int balanc){
       this.shopBalance+=balanc;
       return shopBalance;
   }
   public void Print(){
       System.out.println("name:: " + name +"\n" +"address:: " + address+ "\n" +"countOfProduct:: " + countOfProduct  +"\n" +"priceForProduct:: " + priceForProduct + "\n" +"shopBalance:: " + shopBalance ) ;
   }

}
