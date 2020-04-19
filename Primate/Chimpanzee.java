public class Chimpanzee extends Ape {
  private int numberOfArms = 4;
  protected String name = "Harambe";

  public Chimpanzee(int age) {
    super(age);
    this.size = 59;
  }

  public void displayChimpanzeeDetails() {
    System.out.print("Chimpanzee with age: " + super.getAge());
    System.out.print(" and " + super.size + " meters long");
    System.out.println(" with " + this.numberOfArms + " Arms");

  }

  public String overrideCandidate() {
    return super.overrideCandidate() + " (not really)";
  }

  // overload (different signature)
  public int getAge(int itsAge) {
    return itsAge;
  }

  // override (same signature but same or more accessibility)
  public int getAge() {
    return numberOfArms;
  }

  public static void main(String[] args) {
    Chimpanzee chim = new Chimpanzee(4);
    chim.displayChimpanzeeDetails();
    System.out.println(new Primate().overrideCandidate());
    System.out.println(new Chimpanzee(3).overrideCandidate());
  }
}-