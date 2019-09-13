import java.util.*;

class FilterApp {

  public static void main(String args[]){
    List<String> words = Arrays.asList(args);
    List<String> filtered = valid(words);
    System.out.println(filtered);
  }

  static List<String> valid(List<String> input){
    List<String> output = new ArrayList<>();
    for(String word:input){
      if(word.length()>4){
        output.add(word);
      }
    }
    return output;
  }


}
