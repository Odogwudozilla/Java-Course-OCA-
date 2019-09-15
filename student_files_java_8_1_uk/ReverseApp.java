class ReverseApp {

  public static void main(String args[]) {

    StringBuilder sb = new StringBuilder(args[0]);
    sb.reverse();

    System.out.println(sb);
  }
}