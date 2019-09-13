class DivideApp {
  public static void main (String args[]) {
    int divisor = 0;
    int result = 0;
    try {
       divisor = Integer.parseInt(args[0]);
       result = 100 / divisor; 
    }
    catch(ArrayIndexOutOfBoundsException e) {
       result = 100;
    }
    catch(ArithmeticException e) {
     result = Integer.MAX_VALUE;
     throw e;
    }
    finally {
      System.out.println(result);
    }
  }
}