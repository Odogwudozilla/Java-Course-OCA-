public class Example1 {

  public static void main(String[] args) {
    int number = 1;

    String letters = "abc";

    System.out.println(number(number));

    // letters = letters(letters);

    System.out.println(number + letters);

    System.out.println(number(number) + " " + letters);
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
