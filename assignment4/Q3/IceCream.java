public class IceCream extends DessertItem {
  private double cost;
  
  IceCream(String name, double price) {
    super.name = name;
    this.cost = Math.round(price/100);
  }
}
