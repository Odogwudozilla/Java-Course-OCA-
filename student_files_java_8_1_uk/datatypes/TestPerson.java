class TestPerson {

  public static void main (String args[]) {
    Person rob, ann;     // Declaration of the variables rob and ann

    rob = new Person();  // Initialization of the variables rob and ann
    ann = new Person();

    rob.length =  1.78;   // Assigning values to the variables
    ann.weight = 67.5;

                          // Print the values to the screen

    System.out.println("The length of Rob is " + rob.length + " m.");  
    System.out.println("The weight of Ann is " + ann.weight + " kg.");
  
  }
}
