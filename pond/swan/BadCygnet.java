package pond.swan;

import pond.duck.MotherDuck; // import another package

public class BadCygnet extends MotherDuck {
  public void makeNoise() {
    BadCygnet duck = new BadCygnet();
    duck.quack(); // DOES NOT COMPILE
    System.out.println(duck.noise); // DOES NOT COMPILE
  }
}