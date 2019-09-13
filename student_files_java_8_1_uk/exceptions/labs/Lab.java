class PrimeApp {
  public static void main (String args[]) {
    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);
    
    for(int i=start;i<=end && i>0;i++) {
      if (isPrime(i))
        System.out.println(i);
    }
  }
  
  static boolean isPrime(int number) {
    if (number <= 1) return false;
    if (number == 2) return true;
    if (number % 2 == 0) return false;
    for (int i=3; i<=Math.sqrt(number); i+=2) {
      if(number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
