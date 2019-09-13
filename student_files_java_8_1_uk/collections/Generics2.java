import java.util.*;

class Generics2 {

  public static void main(String args[]) {
    Collection<Float> prices = new ArrayList<Float>();
    prices.add(4.5f);
    prices.add(2.3f);
    showContents(prices);

    Collection<Integer> primes = new ArrayList<Integer>();
    primes.add(5);
    primes.add(7);
    showContents(primes);

    Collection<String> words = Arrays.asList(args);
    showContents(words);
  }


  public static void showContents(Collection<?> c) {
    Iterator<?> i = c.iterator();
    while(i.hasNext()) {
       System.out.println(i.next());
    }
  }

}
