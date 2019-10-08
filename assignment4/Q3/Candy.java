public class Candy extends DessertItem{
  
  private double weight;
  private int priceCent;
  private int cost = Math.round(weight * priceCent);
  
  Candy(String name, double weight, int priceCent) {
    super.name = name;
    this.weight = weight;
    this.price = priceCent;
  }
  
  public int getCost() {
    return this.cost;
  }
}
