class BankAccount {
  private int accountnumber;
  private float balance;

  public BankAccount(int acctno, float bal) {
    accountnumber = acctno;
    balance = bal;
  }

  public void withdraw(float amount) {
    balance = balance - amount;
  }

  public void deposit(float amount) {
    balance = balance + amount;
  }

  public float getBalance() {
    return balance;
  }

  public void transfer(float amount, BankAccount beneficiary) {
    balance = balance - amount;
    beneficiary.deposit(amount);
  }

  public static void main(String[] args) {
    BankAccount accA = new BankAccount(4374289, 1000);
    // System.out.println("The sum of " + amount + "was deposited to account " +
    // accA);
    BankAccount accB = new BankAccount(4374288, 500);
    // System.out.println("The sum of " + amount + "was deposited to account " +
    // accB);
    accA.transfer(67, accB);
    System.out.println("The balance on " + accB + " is " + accB.balance);

  }
}