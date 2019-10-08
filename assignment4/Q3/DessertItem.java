abstract public class DessertItem {
  public String name;
  
  public DessertItem() {
  }
  
  public DessertItem(String name) {
    this.name = name;
  }
  
  public final String getName() {
    return this.name;
  }
  
  abstract int getCost();
}
