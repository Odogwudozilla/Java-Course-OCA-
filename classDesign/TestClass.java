public class TestClass {
  public static void main(String args[]) {
    A b = new B("good bye");

    String result = "AniMal             ";
    System.out.println(result.trim().toLowerCase().replace('a', 'A'));

    Short condition = 1;
    switch (condition) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
    }

  }
}

class A {
  A() {
    this("hello", " world");
  }

  A(String s) {
    System.out.println(s);
  }

  A(String s1, String s2) {
    this(s1 + s2);
  }
}

class B extends A {
  B() {
    super("good bye");
  };

  B(String s) {
    super(s, " world");
  }

  B(String s1, String s2) {
    this(s1 + s2 + " ! ");
  }
}