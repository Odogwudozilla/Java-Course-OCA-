class NestedLoop {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i += 10) {
      for (int j = i; j < i + 10; j++) {
        if (j < 100) {
          System.out.print(" ");
          if (j < 10)
            System.out.print(" ");
        }
        System.out.print(" " + j);
      }
      System.out.println();
    }
  }

}