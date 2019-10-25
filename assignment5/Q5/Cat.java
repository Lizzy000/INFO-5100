import pet;
import boardable;

class Cat extends Pet implements Boardable {
  private String hairLength;
  
  Cat (String name, String ownerName, String color, String hairLength) {
    super(name, ownerName, color);
    this.hairLength = hairLength;
  }
  
  public String getHairLength() {
    return this.hairLength;
  }
  
  public String toString() {
    return super.toString + "Hair:" + hairLength;
  }
}
