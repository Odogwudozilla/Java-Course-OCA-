class BankApp {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(55462462, 0);
    System.out.println("Your account number is: " + ba.accountNumber + " Amount in Account: " + ba.getBalance());
    ba.deposit(150);
    System.out.println("Your account number is: " + ba.accountNumber + ", Amount in Account: " + ba.getBalance());
    ba.deposit(-80);
    System.out.println("Your account number is: " + ba.accountNumber + ", Amount in Account: " + ba.getBalance());
    ba.deposit(-100);
  }
}

class BankAccount {
  final long accountNumber;
  public long balance;

  BankAccount(long accountNumber, long balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public long getBalance() {
    return balance;
  }

  public void deposit(long amount) {
    if ((balance + amount) >= 0) {
      if (amount < 0) {
        System.out.println("You are about to withdraw " + amount);
      } else {

        System.out.println("You are about to deposit " + amount);
      }
      balance += amount;
    } else {
      System.out.println("You are about to withdraw " + amount + " but your balance(" + getBalance() + ") is too low!");
    }

    // return balance;
  }

}