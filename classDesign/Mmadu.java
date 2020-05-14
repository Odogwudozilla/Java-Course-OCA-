import java.util.*;

public class Mmadu extends Mammal {
  protected String name = "Homo Sapien";

  public Mmadu() {
    super("Mammal");

  }

  public void displayMmaduDetails() {
    System.out.println("This Mmadu belongs to the " + super.species + " species and is a " + this.name + " with ID: "
        + super.getMammalId());
  }

  public String getMammalDetails() {
    return " and also a Homo Sapien";
  }

  public static void main(String[] args) {
    Mmadu odogwu = new Mmadu();

    // System.out.println(odogwu.getSpecies());
    odogwu.displayMmaduDetails();
    // System.out.println(new Mmadu().getMammalDetails());
    System.out.println(odogwu.getMammalDetails());

    int[] array1 = {};
    System.out.println(array1.length);

    if (true)
      if (false)
        System.out.println("True False");
      else
        System.out.println("True True");

  }
}