class NullApp {
  public static void main (String args[]) {
    String[] names = new String[5];

    names[0] = "Lily";
    names[1] = "Rose";
    names[2] = "Iris";
    names[4] = "Dandelion";

    for(int i=0;i<names.length;i++) {
      names[i]=names[i].toUpperCase();
      System.out.println(names[i]);
    }
    
  }
}
