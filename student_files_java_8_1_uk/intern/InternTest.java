class InternTest
{
 
 static String naam = "InternTest";
 
 public static void main(String args[])
 {
   Intern test = new Intern();
   System.out.println(test);
 }

 static class Intern
 {
   public String toString() // overschrijft toString() in Object
   {
     return "interne klasse binnen " + naam;
   }
 }
}
