class StudentApp {
  public static void main(String args[]) {
    Student studentA = new Student();
    Student studentB = new Student();
    studentA.setName("Prince");
    studentB.setName("J.F.","Kennedy");
    System.out.println(studentA.name);
    System.out.println(studentB.name);
  }
}
