public class Candy extends DessertItem{
  
  private double weight;
  private double price;
  
  Candy(String name, double weight, double priceCent) {
    super.name = name;
    this.weight = weight;
    this.price = priceCent/100;
  }
}
