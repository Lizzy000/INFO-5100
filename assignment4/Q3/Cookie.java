public class Cookies extends DessertItem {
  private int number;
  private int priceCent;
  private int cost = Math.round((number/12) * priceCent);
  
  Cookies(String name, int number, int priceCent) {
    super(name);
    this.number = number;
    this.priceCent = priceCent;
  }
  
  public int getCost() {
    return this.cost;
  }
  
  
}
