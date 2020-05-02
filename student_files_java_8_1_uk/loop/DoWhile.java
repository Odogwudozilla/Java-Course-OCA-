class DoWhile {

  public static void main(String args[]) {
    int x = 1;
    int count = 0;
    do {
      ++x;
      System.out.print("x is incremented " + ++count + "times to the value of ");
      System.out.println(x);
    } while (x <= 5);
    System.out.println("the while check is false here");
    System.out.println(x);
  }
}
