class TestStaticAtt {
  public static void main(String args[]) {
    System.out.println(StaticAtt.objectCount);
    StaticAtt object1 = new StaticAtt();
    System.out.println(StaticAtt.objectCount);
    StaticAtt object2 = new StaticAtt();
    System.out.println(StaticAtt.objectCount);
  }
}
