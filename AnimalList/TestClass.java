class TestClass {
  void probe(int... x) {
    System.out.println("In ...");
  } // 1

  void probe(Integer x) {
    System.out.println("In Integer");
  } // 2

  void probe(long x) {
    System.out.println("In long");
  } // 3

  void probe(Long x) {
    System.out.println("In LONG");
  } // 4

  static String url = "jdbc://derby://localhost:1527//mydb";

  static TestClass getDatabase() {
    System.out.println("Getting DB");
    return null;
  }

  public static void main(String[] args) {

    AnimalList animList = new AnimalList();

    Dog dog = new Dog();
    Fish fish = new Fish();
    Animal dog1 = new Dog();
    Animal anim = new Animal();

    // animList.addAnimal(dog);
    // animList.addAnimal(fish);

    // The object determines the available methods while the reference determines
    // the available fields/variables
    dog.myName();
    System.out.println(dog.bodyCover);
    fish.myName();
    System.out.println(fish.bodyCover);
    dog1.myName();
    System.out.println(dog1.bodyCover);
    anim.myName();
    System.out.println(anim.bodyCover);
    // fish.myName();

    int i = 1234567890;

    float f = i;
    System.out.println(i - (int) f);
    System.out.printf("%.2f", f);

    UseStatic.meth(42);

    UseStatic sta = new UseStatic();
    sta.nonStatic();

    Integer a = 4;
    new TestClass().probe(a); // 5
    int b = 4;
    new TestClass().probe(b); // 6

    System.out.println(getDatabase().url);

    boolean[] b1 = new boolean[2];
    boolean[] b2 = { true, false };
    System.out.println(b1[0] + ", " + b1[1] + " " + (b1[0] == b2[0]) + ", " + (b1[1] == b2[1]));

  }
}

// Demonstrate static variables, methods, and blocks.
class UseStatic {
  static int a = 3;
  static int b;
  {
    System.out.println("This is in a Static block with the value of a: " + a);
  }

  static void meth(int x) {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  static {
    System.out.println("Static block initialized.");
    b = a * 4;
  }

  public void nonStatic() {
    int c = this.b + this.a;
    System.out.println("This is in a nonStatic method: " + c);
  }

  public static void main(String args[]) {
    meth(24);
  }
}