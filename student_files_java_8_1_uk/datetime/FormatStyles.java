import java.time.*;
import java.time.format.*;

class FormatStyles {

   public static void main(String args[]){
     LocalTime time = LocalTime.now();
     LocalDate date = LocalDate.now();
     LocalDateTime dateTime = LocalDateTime.now();
     FormatStyle[] dateStyles = {FormatStyle.SHORT, FormatStyle.MEDIUM, 
                                 FormatStyle.LONG,  FormatStyle.FULL};
     FormatStyle[] timeStyles = {FormatStyle.SHORT, FormatStyle.MEDIUM};

     System.out.println("Date:");
     for(FormatStyle ds:dateStyles){
       System.out.println(
         DateTimeFormatter
         .ofLocalizedDate(ds)
         .format(date));
     }
     
     System.out.println("\nTime:");
     for(FormatStyle ts:timeStyles){
       System.out.println(
         DateTimeFormatter
         .ofLocalizedTime(ts)
         .format(time));
     }

     System.out.println("\nDateTime:");
     for(FormatStyle ds:dateStyles){
       for(FormatStyle ts:timeStyles){
       System.out.println(
         DateTimeFormatter
         .ofLocalizedDateTime(ds, ts)
         .format(dateTime));
       }
     }
   }
}
