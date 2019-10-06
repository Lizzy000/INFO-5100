
public abstract class Shape {
  String name;
  double perimeter;
  double area;
  
//   Shape(String name, double perimeter, double area) {
//     this.name = name;
//     this.perimeter = perimeter;
//     this.area = area;
//   }
  
  void draw() {
    System.out.pirntIn("Drawing shape");
  };
  abstract getArea();
  abstract getPerimeter();
  
}
  


public class Circle extends Shape {
  
  
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
