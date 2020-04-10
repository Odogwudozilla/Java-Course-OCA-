package pond.duck;

public class MotherDuck {
  protected String noise = "quack";

  protected void quack() {
    System.out.println(noise); // default access is ok
  }

  // private void makeNoise() {
  // quack(); // default access is ok
  // }
}