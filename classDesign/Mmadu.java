package classDesign.files;

public class Mmadu extends Mammal {
  protected String name = "Homo Sapien";

  public Mmadu() {
    super("Mammal");

  }

  public void displayMmaduDetails() {
    System.out.println("This Mmadu belongs to the species and is a " + this.name);
  }

  public String getMammalDetails() {
    return "This is a Homo Sapien";
  }

  public static void main(String[] args) {
    Mmadu odogwu = new Mmadu();
    // System.out.println(odogwu.getSpecies());
    odogwu.displayMmaduDetails();
    System.out.println(new Mmadu().getMammalDetails());
    System.out.println(new Mammal("mammalia").getMammalDetails());

  }

}