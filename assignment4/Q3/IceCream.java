public class IceCream extends DessertItem {
  private int cost;
  
  IceCream(String name, int priceCent) {
    super.name = name;
    this.cost = priceCent;
  }
  
  public int getCost() {
     return this.cost;
  }
}
