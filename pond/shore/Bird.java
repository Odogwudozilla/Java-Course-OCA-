package pond.shore;

import pond.goose.Gosling;

public class Bird {
  protected String text = "floating"; // protected access

  protected void floatInWater() { // protected access
    Gosling goose = new Gosling();
    System.out.println(goose.text);

    Bird gooseb = new Gosling();
    System.out.println(gooseb.text);

    System.out.println(text);
  }
}