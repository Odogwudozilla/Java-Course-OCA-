package classDesign;

public class Mammal extends Animal {
  private String mammalSpecies;
  // protected int Id;

  public Mammal(String species) {
    super(002);
    this.mammalSpecies = species;
    // this.Id = Id;

    // System.out.println("mammal");
  }

  public String getSpecies() {
    return mammalSpecies;
  }

  public String getMammalDetails() {
    return "This is a mammal";
  }

}