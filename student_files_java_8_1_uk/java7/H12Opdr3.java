class NummerFout extends Exception
{
  NummerFout(String s)
  {
    super(s);
  }
  NummerFout(String s, Throwable t)
  {
    super(s,t);
  }
}


public class H12Opdr3 {

  public static void main (String args[]) {
  
   int start=0, einde=0;
  
   try { // probeer code uit te voeren waar een NummerFout in kan optreden

     if (args.length!=2) // niet twee argumenten
        throw new NummerFout("Gebruik: java Priem nr_ondergrens nr_bovengrens.");

     try {  // probeer code uit te voeren waarin NumberFormatException kan optreden
          start = Integer.parseInt(args[0]);
          einde = Integer.parseInt(args[1]);
     }
     catch (NumberFormatException nfe) {
          try {  // naar int omzetten niet gelukt; probeer naar double om te zetten

                Double.parseDouble(args[0]);  // resultaat wordt niet opgeslagen: 
                Double.parseDouble(args[1]);  // proberen of parseDouble() lukt. 

                // gelukt: dan was het probleem dus dat er decimalen in zaten
                throw new NummerFout("geen decimalen s.v.p.", nfe);
          }
 
          catch(NumberFormatException nfe2)  { 
                // niet gelukt: het probleem was dus dat het 
                // geen numerieke waarden waren
                throw new NummerFout("numerieke waarden s.v.p.", nfe2);
          }
     }

     // Hieronder weten we dat Integer.parseInt() is gelukt:
     // er is immers niet naar een catch van de try gesprongen.
        
     if (start>einde)
        throw new NummerFout("Tweede argument moet groter zijn dan eerste.");
          
     if (start<0 || einde<0)
        throw new NummerFout("Negatieve waarden niet toegestaan");
   
   }
   catch (NummerFout nf) {
      nf.printStackTrace();
   }

   for(int i=start;i<=einde && i>0;i++) {
     if (isPriem(i))
       System.out.println(i);
   } 
 }
   static boolean isPriem(int getal) {
     if (getal>2 && getal%2==0)  
        return false;           // even getal groter dan 2: geen priemgetal

     for (int i=3; i<=Math.sqrt(getal); i+=2) { // probeer te delen door oneven getal  
       if (getal % i == 0) {
          return false;         // deelbaar: geen priemgetal
       }
     }
     return true;              // nergens deelbaar gebleken: priemgetal
   }
 }
