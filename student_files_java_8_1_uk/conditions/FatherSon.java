class FatherSon {
  public static void main(String args[]) {
    int ageFather = 50, ageSon = 20;
    double lengthFather = 1.80, lengthSon = 1.90;
    
    if (ageFather>ageSon) {
      System.out.println("Father is older than son");
      if(lengthFather>lengthSon)
        System.out.println("Father is also taller than son");
      else
        System.out.println("Son is taller than father");
    }
    else {
      System.out.println("This is not possible!");
      System.out.println("Further genetic research is required!");
    }
  }
}
