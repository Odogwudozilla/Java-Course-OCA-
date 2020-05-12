public class Animal {
  private String Id;

  public Animal(String animalPrefix) {
    this.Id = animalPrefix;
    // super();
    System.out.println("Animal");
  }

  public String getAnimalId() {
    return Id;
  }
}