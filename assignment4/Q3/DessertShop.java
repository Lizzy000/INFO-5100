public class DessertShop {
  public static final float TAXRATE = 0.002f;
  public static final String STORENAME = "M & M Dessert Shop";
  public static final int WIDTH = 2;
  public static final int MAXNAME = 50;
  public static final String DIVIDER = "-------------------";
  
  public String cents2dollarsAndCents(int cents) {
    return String.valueOf(cents/100);
  }
  
}
