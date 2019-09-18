import javax.management.RuntimeErrorException;

class PrimeApp {

  public static void main(String[] args) {

    if (args.length != 2) {
      throw new RuntimeException("Enter Two whole numbers please");
    }
    int firstNumber = 0, secondNumber = 0;
    try {
      firstNumber = Integer.parseInt(args[0]);
      secondNumber = Integer.parseInt(args[1]);

    } catch (NumberFormatException nfe) {
      try {
        Double.parseDouble(args[0]);
        Double.parseDouble(args[1]);
        throw new RuntimeException("These were numbers with decimals. please use whole numbers");
      } catch (NumberFormatException nfe2) {
        throw new RuntimeException("These were no numbers, please use whole numbers");
      }
    }
    if (firstNumber < 0 || secondNumber < 0) {
      throw new RuntimeException("No negative numbers are allowed");
    }
    if (firstNumber > secondNumber) {
      throw new RuntimeException("First Number greater than second number. Please enter the smaller number first");
    }

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
