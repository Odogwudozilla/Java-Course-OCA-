import java.util.*;

//import java.lang.Comparable;
interface Form extends Comparable<Form> {
  double getArea();

  default int compareTo(Form other) {
    return this.getArea() < other.getArea() ? -1 : this.getArea() > other.getArea() ? 1 : 0;
  }
}

class Circle implements Form {
  private double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public String toString() {
    return "Circle with radius: " + radius + " and area: " + getArea();
  }
}

class Square implements Form {
  private double side;

  Square(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return Math.pow(side, 2);
  }

  @Override
  public String toString() {
    return "Square with side: " + side + " and area: " + getArea();
  }
}

class Form2 {
  public static void main(String[] args) {
    List<Form> myList = new ArrayList<>();
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(8);
    Square s1 = new Square(8);
    Square s2 = new Square(7);
    myList.add(c1);
    myList.add(c2);
    myList.add(s1);
    myList.add(s2);

    Collections.sort(myList);
    for (Form element : myList) {
      System.out.println(element);
    }

  }
}