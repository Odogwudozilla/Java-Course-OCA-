public class Parameters1 {

  public static void main(String args[]){
  
    int foo = 1;
    System.out.println("Foo before: "+foo);
    edit(foo);  
    System.out.println("Foo after:  "+foo);
  }
 
  static void edit(int f) {
    f=0;
  }
}

