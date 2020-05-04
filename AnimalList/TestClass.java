class TestClass {

  public static void main(String[] args) {

    AnimalList animList = new AnimalList();

    Dog dog = new Dog();
    Fish fish = new Fish();
    Animal dog1 = new Dog();
    Animal anim = new Animal();

    // animList.addAnimal(dog);
    // animList.addAnimal(fish);

    dog.myName();
    System.out.println(dog.bodyCover);
    fish.myName();
    System.out.println(fish.bodyCover);
    dog1.myName();
    System.out.println(dog1.bodyCover);
    anim.myName();
    System.out.println(anim.bodyCover);
    // fish.myName();

    int i = 1234567890;

    float f = i;
    System.out.printf("%.2f", f);
    System.out.println(i - (int) f);

  }
}