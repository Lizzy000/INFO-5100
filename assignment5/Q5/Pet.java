package pet;

public class Pet {
  private String petName;
  private String ownerName;
  private String color;
  protected int sex;
  static final int MALE = 0;
  static final int FEMALE = 1;
  static final int SPAYED = 2;
  static final int NEUTERED = 3;
  
  Pet (String name, String ownerName, String color) {
    this.petName = name;
    this.ownerName = ownername;
    this.color = color;
  }
  
  public String getPetName() {
    return this.petName;
  } 
  public String getOwnerName() {
    return this.ownerName;
  }
  public String getColor() {
    return this.color;
  } 
  
  public void setSex(int sexid) {
    this.sex = sexid;
  }
  public String toString() {
    return petName + " owned by " + ownerName + "\n" + "Color:" + color + "\n" + "Sex:" + sex;
  }
}
