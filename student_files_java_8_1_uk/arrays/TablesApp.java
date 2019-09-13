class TablesApp {

  public static void main (String args[]) {
    int[][] tables = new int[12][10];
    for (int i=0;i<tables.length;i++) {
      for (int j=0;j<tables[i].length;j++) {
        tables[i][j]=(i+1)*(j+1);
      }
    }

    // show here the contents of tables


  }

}
