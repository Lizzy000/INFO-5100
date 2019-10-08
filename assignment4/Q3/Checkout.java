
import java.util.Vector;

public class Checkout extends Vector {
  int totalCost = 0;
  double totalTax = 0;
  int count = 0;
  
  Checkout() {
    super();
    DessertShop DS = new DessertShop();
    addElement(STORENAME);
    addElement(DIVIDER);
  }
  
  public void enterItem(DessertItem item) {
    addElement(item);
    totalCost += item.cost;
    count++;
  }
  
  public void clear() {
    clear();
  }
  
  public int totalCost() {
    return totalCost;
  }
  
  public double totalTax() {
    
    totalTax = totalCost * TAXRATE;
    return totalTax;
  }
  
  public int numberOfItems() {  
    return count ;
  }
}
