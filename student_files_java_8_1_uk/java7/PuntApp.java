import java.util.Objects;

class PuntApp extends java.lang.Object
{  
    
  public static void main(String args[])
  {
    Punt p = new Punt();
	p.x=10;
	p.y=20;
    
	String tekst = p.toString();
	System.out.println(tekst);
  }

}

class Punt
{
  public int x;
  public int y;
  
  public String toString ()
  {
    return "Punt op positie (" + x + "," + y + ")";
  }
}
