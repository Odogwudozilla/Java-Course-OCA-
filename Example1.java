public class Example1 {

  static int count;

  public Example1() {
    count++;
  }

  public static void main(String[] args) {
    int number = 1;

    String letters = "abc";

    System.out.println(number(number));

    // letters = letters(letters);

    System.out.println(number + letters);

    System.out.println(number(number) + " " + letters);

    String one = new String();
    StringBuilder two = new StringBuilder();
    String three = one + "a";
    // System.out.println(one == two); // false
    System.out.println(one == three); // true

    Example1 ex = new Example1();
    Example1 ex1 = new Example1();
    Example1 ex2 = new Example1();
    Example1 ex3 = new Example1();
    Example1 ex4 = new Example1();

    System.out.println(count);
  }

  public static int number(int number) {
    number++;
    return number;

  }

  public static String letters(String letters) {
    letters += "d";

    return letters;
  }
}
