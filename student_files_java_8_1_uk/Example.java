import java.time.*;

class Example {
  private int dateofBirth;
  private char maritalStatus;
  private int todayYear;
  // more attributes

  Person(int todayYear, int dateofBirth, char maritalStatus) {
    this.dateofBirth = dateofBirth;
    this.maritalStatus = maritalStatus;
    this.todayYear = todayYear;
  }

  public int getAge() {
    int ageCalc = todayYear - dateofBirth;
    // code of the method
    return ageCalc;
  }

  public void marry() {
    // local variable age is given the value which getAge() returns:
    int age = getAge();
    // check whether somebody is not already married and is older than 18:
    if (maritalStatus != 'M' && age >= 18) {
      System.out.println("This bloke is overdue for marriage");
    } else if (maritalStatus != 'M' && age <= 18) {
      System.out.println("This bloke is too young");
      // generate error message
    } else {
      System.out.println("This bloke is Married");
    }
  }

  public static void main(String[] args) {
    Person Dozie = new Person(2019, 1987, 'U');
    // Dozie.getAge(2019);
    Dozie.marry();

    System.out.println("Succes");

  }
}
