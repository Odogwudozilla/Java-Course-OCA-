public class NwaLemur extends Lemur {
  int fi = 15;
  public int nwaLemurAge = 4;

  public boolean isTailStriped() {
    if (nwaLemurAge > 2) {
      return true;
    }
    return false;
  }

  public boolean hasHair() {
    return false;
  }

  public static void main(String[] args) {
    // NwaLemur reference to a nwaLemur object. Nothing to see here
    NwaLemur nwaLemur = new NwaLemur();
    System.out.println(nwaLemur.getClass().getName() + "'s age is " + nwaLemur.nwaLemurAge);
    System.out.println(nwaLemur.getClass().getName() + "'s tail strippiness is " + nwaLemur.isTailStriped());
    System.out.println(nwaLemur.getClass().getName() + "'s hairriness is " + nwaLemur.hasHair());
    nwaLemur.fi = 20;
    System.out.println(nwaLemur.fi);
    System.out.println(((Lemur) nwaLemur).fi);

    // Lemur reference to a nwaLemur object. Works because nwaLemur is a subclass of
    // Lemur and can therefore fit into Lemur without a cast. Calls nwaLemur's
    // methods but Lemur's instance variables
    Lemur lemur = nwaLemur;
    System.out.println(lemur.getClass().getSuperclass().getName() + "'s age is " + lemur.age);
    System.out.println(lemur.getClass().getSuperclass().getName() + "-referencing-nwaLemur's tail strippiness is "
        + lemur.isTailStriped());
    System.out.println(lemur.getClass().getSuperclass().getName() + "'s hairriness is " + lemur.hasHair());

    // Lemur reference to a Lemur Object. Nothing to see here. Calls Lemur's methods
    Lemur lemur1 = new Lemur();
    System.out.println(lemur1.age);
    System.out.println(lemur1.getClass().getName() + "'s tail strippiness is " + lemur1.isTailStriped());
    System.out.println(lemur1.getClass().getName() + "'s hairriness is " + lemur1.hasHair());

    // Primate reference to a nwaLemur object. Again, indirect inheritance via Lemur
    // (Lemur is a subclass of Primate)
    Primate primate = nwaLemur;
    System.out.println(
        primate.getClass().getSuperclass().getSuperclass().getName() + "'s tail strippiness is " + primate.hasHair());

  }

}