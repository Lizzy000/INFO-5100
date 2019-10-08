public class Candy extends DessertItem{
  
  private double weight;
  private double price;
  private double cost = Math.round(weight * price);
  
  Candy(String name, double weight, double price) {
    super.name = name;
    this.weight = weight;
    this.price = Math.round(price/100);
  }
}
