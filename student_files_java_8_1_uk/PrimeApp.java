class PrimeApp {

  public static void main(String[] args) {
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);

    for (int x = firstNumber; x <= secondNumber; x++) {
      if (isPrime(x)) {
        System.out.println(x);
      }
    }

  }

  static boolean isPrime(int number) {
    if (number <= 1)
      return false;
    if (number == 2)
      return true;
    if (number % 2 == 0)
      return false;
    for (int x = 3; x <= Math.sqrt(number); x += 2) {
      if (number % x == 0) {
        return false;
      }
    }
    return true;
  }
}
