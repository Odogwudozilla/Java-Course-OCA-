import java.util.function.*;

class FunctionApp {
  public static void main(String args[]){
    String word = args[0];
    System.out.println(modify(word,x->x.length()));
    System.out.println(modify(word,x->x.indexOf("i")));
  }

  static int modify (String input
                   , Function<String,Integer> function ){
    int output = function.apply(input);
    return output;
  }
}

