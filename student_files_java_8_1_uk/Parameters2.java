public class Parameters2 {

  public static void main(String args[]){
  
    Foo foo= new Foo();
    System.out.println("foo.bar before: "+foo.bar);
    edit(foo);  
    System.out.println("foo.bar after:   "+foo.bar);
  }
 
  static void edit(Foo f) {
    f.bar=0;
  }
}

class Foo {
  int bar=1;
}
