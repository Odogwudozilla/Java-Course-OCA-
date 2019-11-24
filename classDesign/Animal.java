package classDesign.files;

class Animal {
  private int Id;

  public Animal(int animalId) {
    this.Id = animalId;
    // super();
    // System.out.println("Animal");
  }

  public int getAnimalId() {
    return Id;
  }
}