class TestObjectType {
  public static void main(String args[]) {
    showType("test");
  }

  public static void showType(Object o) {
    System.out.println("The object type of o is: " + o.getClass().getName());
  }
}
