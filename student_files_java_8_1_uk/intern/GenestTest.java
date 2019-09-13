class GenestTest
{

  String naam = "GenestTest";
  
  public static void main(String args[])
  {
    GenestTest gt = new GenestTest();
    System.out.println(gt.new Genest());
  }
   
  class Genest
  {
    String naam="Genest";
    
    public String toString() 
    {
      return "geneste klasse " + this.naam + " binnen " + GenestTest.this.naam;
    }
  }
}
