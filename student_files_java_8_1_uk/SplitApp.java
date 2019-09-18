import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class SplitApp {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>(Arrays.asList(args));

    List<String> removed = remove(words, word -> word.length() >= 4);
    System.out.println("remained: " + words);
    System.out.println("removed: " + removed);

  }

  static List<String> remove(List<String> list, Predicate<String> filter) {
    List<String> result = new ArrayList<>();
    List<String> toBeRemoved = new ArrayList<>();
    for (String word : list) {
      if (!filter.test(word)) {
        result.add(word);

      }
    }
    list.removeAll(result);
    return result;
  }
}
