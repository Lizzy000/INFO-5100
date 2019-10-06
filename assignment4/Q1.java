
public abstract class Shape {
  String name;
  double perimeter;
  double area;
  
  void draw() {
    System.out.pirntIn("Drawing shape");
  };
  abstract getArea();
  abstract getPerimeter();
  
}
  


public class Circle extends Shape {
  double radius;
  
  void draw() {
    System.out.printIn("Drawing circle");
  }
  
  public double getArea(double radius) {
    area = 3.14 * radius * radius;
    return area;
  }
  public double getPerimeter(double radius) {
    perimeter = 2 * 3.14 * radius;
    return perimeter;
  }
}

public class Rectangle extends Shape {
  double width;
  double height;
  
  void draw() {
    System.out.printIn("Drawing rectangle");
  }
  
  public double getArea(double width, double height) {
    area = width * height;
    return area;
  }
  public double getPerimeter(double width, double height) {
    perimeter = 2*(width + height);
    return perimeter;
  }
}

public class Square extends Shape {
  double side;
  
  void draw() {
    System.out.printIn("Drawing square");
  }
  
  public double getArea(double side) {
    area = side * side;
    return area;
  }
  public double getPerimeter(double side) {
    perimeter = 4 * side;
    return perimeter;
  }
}
