public class Lemur extends Primate implements HasTail {
  final int fi = 10;

  public boolean isTailStriped() {
    return true;
  }

  public boolean hasHair() {
    return false;
  }

  public int age = 10;

  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);

    HasTail hasTail = (Lemur) new Lemur();
    System.out.println(hasTail.isTailStriped());

    Primate primate = new Lemur();
    System.out.println(primate.age);
    System.out.println(primate.hasHair());

    Primate primate1 = new Primate();
    System.out.println("This instanceof is " + (lemur instanceof NwaLemur));
    // Lemur lemur1 = (Lemur) primate1;
  }
}