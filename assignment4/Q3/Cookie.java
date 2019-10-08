public class Cookies extends DessertItem {
  private int number;
  private double price;
  private double cost = (number/12) * price;
  
  Cookies(String name, int number, double price) {
    super(name);
    this.number = number;
    this.price = price/100;
  }
  
}
