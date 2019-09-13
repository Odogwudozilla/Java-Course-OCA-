public class StackOverflow {
  static int count=0;
  public static void main(String args[]){
    test();
  }
  private static void test(){
    try{
      System.out.println("test has called itself "+ count+" times.");
      count++;
      test();
    }
    catch(StackOverflowError soe){
      System.err.println("StackOverflowError: test() call stack is nested too deep.");
    }
  }
}
