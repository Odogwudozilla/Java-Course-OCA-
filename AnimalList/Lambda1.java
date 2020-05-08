class Lambda1 {

  public static void main(String[] args) {
    MyNumber myNum;

    myNum = () -> Math.random() * 123.45;

    System.out.println(myNum.getValue());

  }
}

interface MyNumber {
  double getValue();
}