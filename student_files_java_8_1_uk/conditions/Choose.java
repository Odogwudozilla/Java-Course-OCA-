class Choose {
  public static void main(String args[]) {
    int test = Integer.parseInt(args[0]);
    if(test>10) {
      System.out.println("greater than 10");
    }
    else {
      if(test>5) {
        System.out.println("between 6 and 10");
      }
      else {
        if(test>1) {
          System.out.println("between 2 and 5");
        }
        else {
          System.out.println("1 or less");
        }
      }
    }
  }
}
