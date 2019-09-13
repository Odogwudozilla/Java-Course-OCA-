class CloneApp implements Cloneable{

  int x = 1;
  
  public static void main(String args[]) throws CloneNotSupportedException{
    CloneApp c = new CloneApp();
    CloneApp c2 = (CloneApp)c.clone();
    System.out.println("c==c2? "+(c==c2));
    System.out.println("c.x==c2.x? " + (c.x==c2.x));
  }
  
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}
