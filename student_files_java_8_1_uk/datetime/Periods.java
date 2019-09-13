import java.time.*;

class Periods {

  public static void main(String args[]){
    Period twoWeeks = Period.ofWeeks(2);
    Period fourWeeks = Period.ofWeeks(4);
    calendar(LocalDate.of(2016,1,12),twoWeeks, "residual waste");
    calendar(LocalDate.of(2016,1,5),twoWeeks, "garden wase");
    calendar(LocalDate.of(2016,1,31),fourWeeks,"paper waste");
  }

  public static void calendar (LocalDate start, 
                               Period periode, 
                               String garbageBin){
    System.out.println(garbageBin);
    LocalDate day = start;
    while(day.isBefore(LocalDate.of(2017,1,1))){
      System.out.println(day);
      day = day.plus(periode);
    }
  }
}
