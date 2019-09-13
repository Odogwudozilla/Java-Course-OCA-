import java.time.*;

public class Of {
  public static void main (String args[]){
    LocalDate date_1 = LocalDate.of(2016,9,25);
    // Mind to not use 09, this is seen as an octal number.
    LocalDate date_2 = LocalDate.of(2016,Month.SEPTEMBER, 26);
    // enum java.time.Month
    LocalTime lunch = LocalTime.of(12,0);
    LocalDateTime fireworks = LocalDateTime.of(2017,1,1,0,0);
    LocalDateTime lunchToday = LocalDateTime.of(LocalDate.now(),lunch);
    System.out.println(date_1);
    System.out.println(date_2);
    System.out.println(lunch);
    System.out.println(fireworks);
    System.out.println(lunchToday);
  }
}
