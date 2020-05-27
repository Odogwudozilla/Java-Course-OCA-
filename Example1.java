public class Example1 {

  public static void main(String[] args) {
    int number = 1;

    String letters = "abc";

    System.out.println(number(number));

    // letters = letters(letters);

    System.out.println(number + letters);

    System.out.println(number(number) + " " + letters);

    String string = "odogwudozilla";
    System.out.println(string.indexOf('o')); // 0
    System.out.println(string.indexOf("zi")); // 4
    System.out.println(string.indexOf('o', 5)); // 4
    System.out.println(string.indexOf("gw", 9)); // -1
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
