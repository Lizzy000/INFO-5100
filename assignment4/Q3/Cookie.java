public class Cookies extends DessertItem {
  private int number;
  private double price;
  private double cost = Math.round((number/12) * price);
  
  Cookies(String name, int number, double price) {
    super(name);
    this.number = number;
    this.price = Math.round(price/100);
  }
  
}
