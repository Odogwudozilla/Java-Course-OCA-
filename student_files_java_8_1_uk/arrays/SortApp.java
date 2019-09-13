import java.util.Arrays;

public class SortApp {

  public static void main(String args[]) {
    String[] input = Arrays.copyOf(args,args.length);
    Arrays.sort(input);
    System.out.println(Arrays.toString(input));
  }
}
