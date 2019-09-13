import java.util.*;

class PricesApp {

  public static void main (String args[]) {
    float sum = 0;
    Map<String, Float> prices = new HashMap<String, Float>();
    prices.put("coffee", new Float(1.60)); // Float as wrapper class of float
    prices.put("tea",    new Float(1.50));
    prices.put("cake",   new Float(2.15));

    sum+=price(prices.get("coffee"), 2);
    sum+=price(prices.get("tea"), 1);
    sum+=price(prices.get("cake"), 1); 
       
    System.out.println(sum);
  }

  static float price(Float f, int count) {
    return f.floatValue()*count; // get primitive float from wrapper Float
  }

}
