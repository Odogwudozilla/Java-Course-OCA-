import java.util.*;

class AnimalList {

  private Animal[] animalList = new Animal[10];

  private int i = 0;

  public void addAnimal(Animal anumanu) {
    if (i < animalList.length) {
      animalList[i] = anumanu;
      System.out.println(anumanu.getClass().getSimpleName() + " added at index " + i);
      i++;

    }

    System.out.println(Arrays.deepToString(animalList));
  }

}