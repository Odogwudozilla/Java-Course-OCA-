import java.time.*;
import java.time.format.*;

class BirthdayApp {
  public static void main(String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage; java BirthdayApp MM-dd-yyyy");
    }
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    LocalDate birthday = LocalDate.parse(args[0], dtf);
    birthday = birthday.withYear(Year.now().getValue());
    String message = "";
    Period p = null;
    LocalDate today = LocalDate.now();
    if (birthday.isBefore(today)) {
      p = Period.between(birthday, today);
      message = "Your birthday was " + p.getMonths() + " months and " + p.getDays() + " days ago.";
    } else if (today.isBefore(birthday)) {
      p = Period.between(today, birthday);
      message = "Your birthday is in " + p.getMonths() + " months and " + p.getDays() + " days agao.";
    } else {
      message = "Hurray, It's your birthday!";
    }
    System.out.println(message);
  }

}