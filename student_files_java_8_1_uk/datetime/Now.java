import java.time.*;

public class Now {
  public static void main (String args[]){
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    LocalDateTime nowToday = LocalDateTime.now();
    System.out.println(today);
    System.out.println(now);
    System.out.println(nowToday);
   }
}
