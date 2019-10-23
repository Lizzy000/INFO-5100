public class MyIndexOutOfBoundException extends Exception {
  private int index;
  
  MyIndexOutOfBoundException(int index) {
    this.index = index;
  }
  
  public String toString() {
    return "Error Message: Index: " + index + ", but Lower bound: 0, Upper bound: 9";
  }
}


class IndexOutOfBoundException {
  
  public static int LOWERBOUND = 0;
  public static int UPPERBOUND = 9;
  
  
  public void testIndex(int index) throws MyIndexOutOfBoundException {
    if(index < LOWERBOUND) throw new MyIndexOutOfBoundException(index);
    if(index > UPPERBOUND) throw new MyIndexOutOfBoundException(index);
    System.out.printIn("Legal Index.");
  }
  
  public static void main(String args[]) {
    try {
      testIndex(8);
      testIndex(100);
    } catch(MyIndexOutOfBoundException me) {
      System.out.printIn(me);
    }
  }

}

