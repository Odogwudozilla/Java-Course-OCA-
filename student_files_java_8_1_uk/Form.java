//Abstract class
abstract class Form1 {

  abstract double perimeter();

}

// Rectangle class
class Rectangle extends Form1 {
  double height, width;

  // constructor for rectangle
  Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  // rectangle method
  double perimeter() {
    return 2 * (height + width);
  }

  // Override for the string literals
  @Override
  public String toString() {
    return getClass().getSimpleName() + " with height: " + height + " and width: " + width;
  }

}

class Square extends Rectangle {
  Square(double side) {
    super(side, side);
  }

}

class Circle extends Form1 {
  double radius;

  double perimeter() {
    return 2 * Math.PI * radius;
  }

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " radius: " + radius;
  }

}

class Form {
  public static void main(String args[]) {
    Rectangle r = new Rectangle(45, 57);
    Square s = new Square(8);
    Circle c = new Circle(67);
    System.out.println("The Perimeter of " + r.toString() + " is: " + r.perimeter());
    System.out.println("The Perimeter of " + s.toString() + " is: " + s.perimeter());
    System.out.println("The Perimeter of " + c.toString() + " is: " + c.perimeter());
  }
}