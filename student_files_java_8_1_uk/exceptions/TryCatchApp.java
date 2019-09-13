import java.text.NumberFormat;
import java.util.Locale;
class TryCatchApp {
  public static void main (String args[]) {
    double amount=0;
    try {
      amount = Double.parseDouble(args[0]);
      System.out.println("Amount in Euro's: " + getAmount(amount));
    }
    catch(RangeException e) {
      System.err.println(e.getMessage());
    }
    catch(FloatingPointException e) {
      e.printStackTrace();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    finally {
      System.out.println("Amount was: " + amount);
    }
  }

  static String getAmount(double amount) throws RangeException, FloatingPointException {
    if(amount<=0 || amount>=100000)
      throw new RangeException("Amount nnot betwee 0 and 100000.");
    if(Math.abs((amount*100)-Math.rint(amount*100))>.000000001)
      throw new FloatingPointException("Amount more than 2 decimals");
    Locale local = new Locale("nl","NL", "EURO");
    NumberFormat form = NumberFormat.getCurrencyInstance(local);
    return form.format(amount);
  }
}

class RangeException extends Exception {
  RangeException(String s) {
    super(s);
  }
}
class FloatingPointException extends Exception {
  FloatingPointException(String s) {
    super(s);
  }
}
