class Spider extends Animal {
  int legCount = 8;

  void showLegCount() {
    System.out.println("number of legs Spider: " + legCount);
    System.out.println("number of legs Animal: " + super.legCount);
  }
}
