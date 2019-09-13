class Enums2 {

  enum Sizes {
     S("Small"), M("Middle"), L("Large")
     , XL("Extra Large"), XXL("Extra Extra Large");

     private final String size;
     
     Sizes(String size) { 
       this.size=size;
     }

     @Override
     public String toString() {
       return size;
     }
  }
  
  public static void main(String args[]) {
    for(Sizes m:Sizes.values()) {
      System.out.println(m);
    }
  }
}
