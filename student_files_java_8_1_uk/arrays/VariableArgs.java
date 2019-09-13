class VariableArgs {

    public static void showNames(String... names)  {
       for (String name: names)              
          System.out.println(name); 
    } 
 
    public static void main( String args[] ) {
      showNames("Huey", "Dewey", "Louie");
    } 
}
