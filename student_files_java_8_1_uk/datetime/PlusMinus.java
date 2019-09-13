import java.time.*;


class PlusMinus {
  public static void main(String args[]){
    LocalDate date = LocalDate.of(2016,2,28); // leap year 
    date = date.plusDays(1);
    System.out.println(date);
    LocalTime time = LocalTime.of(22,30,0); // 22:30 uur
    time = time.plusHours(3)
               .minusMinutes(5)
               .plusSeconds(10);
    System.out.println(time);
  }
}
