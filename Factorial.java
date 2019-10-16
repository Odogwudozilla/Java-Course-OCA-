
class FactorialCalc {
  long number;

  FactorialCalc(long number) {
    this.number = number;
  }

  long factorialMethod() {
    int f = 1;
    for (int i = 1; i <= number; i++) {
      System.out.println(f);
      f *= i;
    }
    return f;
  }
}

class Factorial {
  public static void main(String[] args) {
    FactorialCalc fr = new FactorialCalc(15);
    System.out.println(fr.factorialMethod());

  }

}