interface Range {
  int getLowerBound();
  int getUpperBound();

  default int pctInRange(int value){
    int range = getUpperBound()-getLowerBound();
    double pct = (double) (value - getLowerBound())/range * 100;
    return (int)pct;
  }

  static Range of (int x, int y){
    return new Range(){ // anonieme inner class
      public int getLowerBound(){ return x<y?x:y; }
      public int getUpperBound(){ return x>y?x:y; }
    };
  }
}

class Fahrenheit {
  public final static int FREEZING_POINT = 32;
  public final static int BOILING_POINT = 212;
  private int degrees;

  Fahrenheit(int degrees){
    this.degrees=degrees;
  }

  public int getDegrees(){
    return degrees;
  }
  
}

class RangeApp {
  public static void main(String args[]){

  }
}
