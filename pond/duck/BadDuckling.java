package pond.duck;

public class BadDuckling {

  public void makeNoise() {
    MotherDuck duck = new MotherDuck();

    duck.quack(); // DOES NOT COMPILE

    System.out.println(duck.noise); // DOES NOT COMPILE
  }
}