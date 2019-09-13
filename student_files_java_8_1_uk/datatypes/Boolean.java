class Boolean
{
  public static void main (String args[])
  {
    System.out.println("testX() && testY() is " + (testX() && testY() ? "waar" : "niet waar"));
    System.out.println();
    System.out.println("testX() || testY() is " + (testX() || testY() ? "waar" : "niet waar"));
    System.out.println();
    System.out.println("testX() &  testY() is " + (testX() &  testY() ? "waar" : "niet waar"));
    System.out.println();
    System.out.println("testX() |  testY() is " + (testX() |  testY() ? "waar" : "niet waar"));
  }
  
  static boolean testX()
  {
    System.out.println("testX() is uitgevoerd");
    return false;
  }
  
  static boolean testY()
  {
    System.out.println("testY() is uitgevoerd");
    return true;
  }
}