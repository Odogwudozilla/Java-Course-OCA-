public class TestClass {

  public static void main(String args[]) {
    A bb = new B("good bye");

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

    System.out.println(Byte.MAX_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
    System.out.println("Char: " + Character.MAX_VALUE);

    System.out.println(Boolean.parseBoolean("true") == true);
    System.out.println(Boolean.parseBoolean("TrUe") == new Boolean(null));
    System.out.println(new Boolean("TrUe") == new Boolean(true));
    // System.out.println(new Boolean() == false);
    System.out.println(new Boolean("true") == Boolean.TRUE);
    System.out.println(new Boolean("no") == false);

    String mStr = "123";
    long m = Long.valueOf(mStr).longValue();
    long ma = Long.parseLong(mStr);

    float amount = 1000.0f;

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
