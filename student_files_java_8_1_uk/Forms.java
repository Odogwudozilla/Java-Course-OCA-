abstract class Form {
  abstract double area();
}

// Rectangle Class
class Rectangle extends Form {
  // declare class/instance variables
  private double width, height;

  // constructor for rectangel
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * @return the width
   */
  public double getWidth() {
    return width;
  }

  /**
   * @return the height
   */
  public double getHeight() {
    return height;
  }

  // Override the abstract class method
  @Override
  double area() {
    return width * height;
  }
}

class Square extends Rectangle {

  Square(double side) {
    super(side, side); // assign from super since parameter and calculation are the same
  }
}

class Bar extends Rectangle {
  private double depth;

  Bar(double width, double height, double depth) {
    super(width, height); // assign first two from super since parameter and calculation are the same
    this.depth = depth; // the new paremeter introduced
  }

  // Override the rectangle area method since parameters are different. Grab
  // height and width from the gettte methods
  @Override
  double area() {
    return 2 * (getWidth() * getHeight() + getWidth() * depth + getHeight() * depth);
  }

  double volume() {
    return getWidth() * getHeight() * depth;
  }
}

class Cube extends Bar {
  Cube(double side) {
    super(side, side, side);
  }
}

class Forms {
  public static void main(String[] args) {
    Bar b = new Bar(3, 4, 4);
    System.out.println(b.area());
    System.out.println(b.volume());

    Square s = new Square(4);
    System.out.println(s.area());
  }
}