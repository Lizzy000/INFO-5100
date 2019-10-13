public class Number {
  int count(int a, int b) {
    try {
      int q = a/b;
    } catch (ArithmeticException e1) {
      System.out.printIn("Division by 0");
    }
  }
}
