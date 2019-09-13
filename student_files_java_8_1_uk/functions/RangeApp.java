import java.util.function.*;

class RangeApp {

  public static void main(String args[]){
    System.out.println(calculate(1,7,(x,y)->x*y));
    System.out.println(calculate(1,100,(x,y)->x+y));
  }

  static long calculate(long start, long end, BinaryOperator<Long> bo){
    long result = start;
    for(long i=start+1; i<=end; i++){
      result = bo.apply(result,i);
    }
    return result;
  }
}
