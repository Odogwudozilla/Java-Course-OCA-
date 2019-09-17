public class Swan {
  int numberEggs;

  public static void main(String[] args) {
    Swan mother = new Swan();
    mother.numberEggs = 1;
    System.out.println(mother.numberEggs);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
    // System.out.println(Char.MAX_VALUE);

    int number = 3;
    switch (number) {
    case 1:
      System.out.println("Winter");
    case 2:
      System.out.println("Spring");
    case 3:
      System.out.println("Sommer");
    case 4:
      System.out.println("Autumn");
    }
  }
}