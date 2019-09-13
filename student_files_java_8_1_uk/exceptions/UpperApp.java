class UpperApp {
  public static void main (String args[]) throws Exception {
    if(args.length!=1) {
      Exception e = new Exception("Use: UpperApp <word>");
      throw e;
    }
    System.out.println(args[0].toUpperCase());
  }
}
