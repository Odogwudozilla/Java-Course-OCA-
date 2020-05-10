public class FeedingSchedule {
  public static void main(String[] args) {
    boolean keepGoing = true;
    int count = 0;
    int x = 3;
    while (count++ < 3) {
      int y = (1 + 2 * count) % 3;
      System.out.println("x is: " + x + " while y is: " + y + " and count is: " + count);
      switch (y) {
        default:
        case 0:
          x -= 1;
          break;
        case 1:
          x += 5;
      }
      System.out.println("2ND LEVEL: x is: " + x + " while y is: " + y + " and count is: " + count);
    }
    System.out.println(x);
  }
}