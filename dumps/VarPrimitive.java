import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VarPrimitive {
  public static void main(String[] args) {
    int iVar = 100;
    float fVar = 100.100f;
    double dVar = 123;

    // a smaller type cannot be assigned to a larger type without an explicit cast
    iVar = (int) fVar;
    fVar = iVar;
    dVar = fVar;
    fVar = (float) dVar;
    dVar = iVar;
    iVar = (int) dVar;

    System.out.println(iVar);
    System.out.println(fVar);
    System.out.println(dVar);

    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate.of(2014, 6, 20);
    LocalDate date3 = LocalDate.parse("20140620", DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);
    System.out.println("date3 = " + date3);
  }
}