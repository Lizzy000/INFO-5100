public class Sundae extends IceCream {
  private String toppingName;
  private double toppingPrice;
  private double cost = Math.round(super.cost + toppingPrice);
  
  Sundae(String name, double cost, String toppingName, double toppingPirce) {
    super(name, cost);
    this.toppingName = toppingName;
    this.toppingPrice = Math.round(topingPrice/100);
  }
}
