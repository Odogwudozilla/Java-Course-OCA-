public class Lemur extends Primate implements HasTail {
  public boolean isTailStriped() {
    return false;
  }

  public int age = 10;

  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);

    HasTail hasTail = lemur;
    System.out.println(hasTail.isTailStriped());

    Primate primate = lemur;
    System.out.println(primate.hasHair());

    Primate primate1 = new Primate();
    System.out.println("This instanceof is " + (primate1 instanceof HasTail));
    // Lemur lemur1 = (Lemur) primate1;
  }
}