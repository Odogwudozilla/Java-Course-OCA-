class Enums {

  enum Sizes {S, M, L, XL, XXL};
  
  public static void main(String args[]) {
    for(Sizes s:Sizes.values()) {
      System.out.print(s);
      System.out.println(description(s));
    }
  }
  
  private static String description(Sizes value) {
    switch(value) {
      case S: return " Small";
      case M: return " Middle";
      case L: return " Large";
      case XL: return " Extra Large";
      case XXL: return " Extra Extra Large";
      default: return " Onbekende maat";
    }
  }
}
