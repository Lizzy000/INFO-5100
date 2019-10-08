public class Candy extends DessertItem{
  
  private double weight;
  private double price;
  private double cost = weight * price;
  
  Candy(String name, double weight, double price) {
    super.name = name;
    this.weight = weight;
    this.price = price/100;
  }
}
