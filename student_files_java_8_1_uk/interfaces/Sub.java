interface E { int x = 10; }  // x is implicitly public final static
interface F { int x = 20; }
interface G extends E, F {  }

class Sub implements G { }

class SubApp {
  public static void main(String args[]){
    G test = new Sub(); // this can be done, because Sub is a G
    System.out.println(test.x); // what is the value of x?
  }
}
