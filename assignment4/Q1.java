
public class Shape {
  String name;
  double perimeter;
  double area;
  
  void draw() {
    System.out.pirntIn("Drawing shape");
  };
  double getArea() {
    area = 0;
  };
  double getPerimeter() {
    perimeter = 0;
  };
  
}
  


public class Circle extends Shape {
  double radius;
  
  void draw() {
    System.out.printIn("Drawing circle");
  }
  
  double getArea(double radius) {
    area = 3.14 * radius * radius;
    return area;
  }
  double getPerimeter(double radius) {
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
  
  double getArea(double width, double height) {
    area = width * height;
    return area;
  }
  double getPerimeter(double width, double height) {
    perimeter = 2*(width + height);
    return perimeter;
  }
}

public class Square extends Shape {
  double side;
  
  void draw() {
    System.out.printIn("Drawing square");
  }
  
  double getArea(double side) {
    area = side * side;
    return area;
  }
  double getPerimeter(double side) {
    perimeter = 4 * side;
    return perimeter;
  }
}
