class A {
  public int i = 10;
  public int j = 20;
}

class B extends A {
  private int i = 30;
  public int k = 40;
}

class C extends B {
}

public class TestClass {
  public static void main(String args[]) {
    C c = new C();
    System.out.println(((A) c).i);
    System.out.println(c.j);
    System.out.println(c.k);
  }
}