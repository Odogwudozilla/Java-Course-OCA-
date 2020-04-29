import java.util.Arrays;

public class StringStringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("start");
    sb.append("+middle");
    StringBuilder same = sb.append("+end");
    System.out.println(sb);
    System.out.println(same);

    String[] bugs = { "cricket", "beetle", "ladybug" };
    String[] alias = bugs;
    Arrays.sort(bugs);
    System.out.println(bugs.equals(alias)); // true
    System.out.println(Arrays.toString(bugs));

    for (String bug : bugs)
      System.out.println(bug + ", ");

    Double wrapper = Double.valueOf("123.45");
    System.out.println(wrapper);
  }
}