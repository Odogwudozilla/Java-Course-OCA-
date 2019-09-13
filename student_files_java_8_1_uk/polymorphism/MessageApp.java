class MessageApp {
  public static void main (String args[]) {
    Message m1 = new Letter();
    Message m2 = new Email();
    m1.send();
    m2.send();
  }
}
