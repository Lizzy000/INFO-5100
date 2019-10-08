public class Sundae extends IceCream {
  private String toppingName;
  private double toppingPrice;
  
  Sundae(String name, double price, String toppingName, double toppingPirce) {
    super(name, price);
    this.toppingName = toppingName;
    this.toppingPrice = topingPrice/100;
  }
}
