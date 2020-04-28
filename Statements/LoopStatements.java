public class LoopStatements {

  public void nestedLoop(int value) {
    while (value > 0) {

      do {
        value -= 2;
        // System.out.println(value);
      } while (value > 5);
      value--;
      System.out.println(value);
    }
  }

  public void forLoop() {
    int x = 0;
    int y = 7;
    for (y = 0, x = 2; x < 5 && y < 10; x++, y++) {
      System.out.println(x + " ");
    }
  }

  public void doWhile(int param) {

    if (param <= 1) {

      do {
        param++;
        System.out.println(param);
      } while (param < 2);
    } else {
      param--;
      System.out.println(param);
    }
  }

  public void anotherNested(int y) {
    do {
      y = 1;
      System.out.print(++y + " ");

    } while (y <= 10);
  }

  public static void main(String[] args) {

    LoopStatements dw = new LoopStatements();
    // dw.doWhile(2);
    // dw.forLoop();
    // dw.nestedLoop(20);
    dw.anotherNested(1);

  }
}