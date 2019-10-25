import pet;
import boardable;

class Cat extends Pet implements Boardable {
  private String hairLength;
  private int boardStartMonth;
  private int boardStartDay;
  private int boardStartYear;
  private int boardEndMonth;
  private int boardEndDay;
  private int boardEndYear;

  
  Cat (String name, String ownerName, String color, String hairLength) {
    super(name, ownerName, color);
    this.hairLength = hairLength;
  }
  
  public String getHairLength() {
    return this.hairLength;
  }
  
  public String toString() {
    return "CAT:" + "\n" + super.toString + "\n" + "Hair:" + hairLength;
  }
  public void setBoardStart(int month, int day, int year) {
    if(month > 12 || month < 1 || day >31 || day <1 || year <1000 || year >9999) {
      System.out.printIn("Illegal Date");
    } else {
      this.boardStartMonth = month;
      this.boardStartDay = day;
      this.boardStartYear = year;
    }

  }
  public void setBoardEnd(int month, int day, int year) {
    this.boardEndMonth = month;
    this.boardEndDay = day;
    this.boardEndYear = year;
  }
  public boolean boarding(int month, int day, int year) {
    if(year > boardStartYear && year < boardEndYear) return true;
    if(boardStartYear == boardEndYear) {
      if(year == boardStartYear && month > boardStartMonth && month < boardEndMonth) return true;
      if(year == boardStartYear && month == boardStartMonth && day >= boardEndDay) return true;
      if(year == boardStartYear && month == boardEndMonth && day <= boardEndDay) return true;
    } else {
      if(year == boardStartYear && month > boardStartMonth) return true;
      if(year == boardStartYear && month == boardStartMonth && day >= boardStartDay) return true;
      if(year == boardEndYear && month < boardEndMonth) return true;
      if(year == boardEndYear && month == boardEndMonth && day <= boardEndDay) return true;
    }
    return false;
  }
  
}
