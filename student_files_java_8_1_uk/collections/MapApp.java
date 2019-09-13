import java.util.*;

class MapApp {
  public static void main (String args[]) {
    Map<String, String> departments = new TreeMap<String, String>();
    departments.put("10","ACCOUNTING");          // filling the Map
    departments.put("20","RESEARCH");
    departments.put("30","SALES");
    departments.put("40","PRODUCTION");

    System.out.println(departments);              // show complete Map
    System.out.println(departments.keySet());     // show all keys
    System.out.println(departments.values());     // show all values
    System.out.println(departments.entrySet());   // show key-value pairs
    System.out.println(departments.get("30"));    // show value of key "30"
  }
}
