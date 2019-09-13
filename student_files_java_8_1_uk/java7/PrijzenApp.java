import java.util.*;

class PrijzenApp
{

  public static void main (String args[])
  {
    float totaal = 0;
    Map<String, Float> prijzen = new HashMap<String, Float>();
    prijzen.put("koffie", 1.60f); // Autoboxing: de primitieve float waarden worden
    prijzen.put("thee", 1.50f);   // automatisch naar hun wrapper class Float gecast.
    prijzen.put("gebak", 2.15f);


    totaal+=prijs(prijzen.get("koffie"), 2);
    totaal+=prijs(prijzen.get("thee"), 1);
    totaal+=prijs(prijzen.get("gebak"), 1); 
       
	  System.out.println(totaal);
  }

  static float prijs(Object o, int aantal)
  {
    return (Float) o * aantal;  // De methode get() van Map retourneert een
                                // Object: moet gecast worden naar Float.
                                // Dankzij unboxing hebben we geen floatValue() nodig en
                                // wordt de waarde als primitieve float geretourneerd.

  }

}
