public class Mammal extends Animal {
  protected String Id;
  protected String species;

  public Mammal(String mammalSpecies) {
    super("AN");
    this.species = mammalSpecies;
    this.Id = super.getAnimalId() + "-" + mammalSpecies;

    System.out.println("mammal");
  }

  public String getMammalId() {
    return Id;
  }

}