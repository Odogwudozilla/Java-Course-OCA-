import java.time.*;
import java.time.format.*;
class Parse {
  public static void main(String args[]){
    switch(args.length){
       case 2: print(args[0],args[1]); break;
       case 3: print(args[0],args[1],args[2]); break;
       default: throw new IllegalArgumentException("usage: java Parse date/time/datetime String [pattern]"); 
    }
  }
  static void print(String type, String value){
    switch(type.toLowerCase()){
      case "date": System.out.println(LocalDate.parse(value)); break;
      case "time": System.out.println(LocalTime.parse(value)); break;
      case "datetime": System.out.println(LocalDateTime.parse(value)); break;
      default: throw new IllegalArgumentException("The type should be one of the values date, time or datetime");
    }
  }
  static void print(String type, String value, String pattern){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
    switch(type.toLowerCase()){
      case "date": System.out.println(LocalDate.parse(value,dtf)); break;
      case "time": System.out.println(LocalTime.parse(value,dtf)); break;
      case "datetime": System.out.println(LocalDateTime.parse(value,dtf)); break;
      default: throw new IllegalArgumentException("The type should be one of the values date, time or datetime");
    }
  }
}
