public class Sundae extends IceCream {
  private String toppingName;
  private int toppingPriceCent;
  private int cost = super.cost + toppingPriceCent;
  
  Sundae(String name, int cost, String toppingName, int toppingPirceCent) {
    super(name, cost);
    this.toppingName = toppingName;
    this.toppingPriceCent = toppingPriceCent;
  }
}
