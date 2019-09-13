class RectangleApp {
  public static void main(String args[]) {
    Rectangle r1 = new Rectangle();
    System.out.println("Area r1: " + (r1.height*r1.width));
    Rectangle r2 = new Rectangle(15,20);
    System.out.println("Area r2: " + (r2.height*r2.width));
  }
}
