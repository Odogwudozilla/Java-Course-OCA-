import java.time.*;
import java.time.format.*;

class ShowTime {

  private final static String now;
  
  static {
    LocalTime time = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter
                                    .ofLocalizedTime(FormatStyle.MEDIUM);
    now = formatter.format(time);
  }
  
  public static void main (String args[]) {
    System.out.println(now);
  }
}
