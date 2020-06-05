
public class DerivedB extends DerivedA {

  String whatAmI = "I am a DerivedB";

  public void test() {
    System.out.println("DerivedB");
  }

  public static void main(String[] args) {
    Base b1 = new DerivedB();
    Base b2 = new DerivedA();
    Base b3 = new DerivedB();

    b1 = (Base) b3;
    Base b4 = (DerivedA) b3;

    b1.test();
    System.out.println(b1.whatAmI);
    b4.test();
    System.out.println(b4.whatAmI);
    b2.test();
  }
}