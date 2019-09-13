import java.util.*;

class Generics3 {

  public static void main(String args[]) {
    Collection<Float> prices = new ArrayList<Float>();
    prices.add(4.5f);
    prices.add(2.3f);
    showSum(prices);

    Collection<Integer> primes = new ArrayList<Integer>();
    primes.add(5);
    primes.add(7);
    showSum(primes);
  }

  public static void showSum(Collection<? extends Number> c) {
    float sum=0;
    Iterator<? extends Number> i = c.iterator();
    while(i.hasNext()) {
      sum+=i.next().floatValue();
    }
    System.out.println(sum);
  }
}
