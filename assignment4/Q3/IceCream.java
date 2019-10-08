public class IceCream extends DessertItem {
  private double price;
  
  IceCream(String name, double price) {
    super.name = name;
    this.price = price/100;
  }
}
