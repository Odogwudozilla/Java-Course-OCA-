public class JustLooping {
  private int j;

  void showJ() {
    while (j <= 5) {
      for (int j = 1; j <= 5;) {
        System.out.print(j + " ");
        j++;
      }
      System.out.println("for loop ended ");
      j++;
    }
  }

  public static void main(String[] args) {
    new JustLooping().showJ();

    byte starting = 3;
    short firstValue = 5;
    int secondValue = 7;
    int functionValue = (int) (starting / 2 + firstValue / 2 + (int) firstValue / 3) + secondValue / 2;
    int comp = (3 / 2 + 5 / 2 + 5 / 3) + 7 / 2;
    System.out.println(comp);
  }
}