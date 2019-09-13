interface Range {
  int getLowerBound();
  int getUpperBound();
  default int pctInRange(int value){
    int range = getUpperBound()-getLowerBound();
    double pct = (double) (value - getLowerBound())/range * 100;
    return (int)pct;
  }

  static Range between (int x, int y){
    return new Range(){ // anonymous inner class
      public int getLowerBound(){ return x<y?x:y; }
      public int getUpperBound(){ return x>y?x:y; }
    };
  }
} 
