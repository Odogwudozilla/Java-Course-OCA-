class Garbage {

  private static Object[][] objecten=new Object[100][100];
  
  static { 
    for (int i=0;i<100;i++){
      for (int j=0;j<100;j++){
        final int x=i;
        final int y=j;
        objecten[i][j]=new Object(){ public String toString(){
                                       return "Object["+x+"]["+y+"]";
                                     }
                                   };
      }       
    }
  }

   public static void main(String args[]) {
     for (int i=0; i<=100000; i++){
       System.out.println(i);
     }

     for (int i=0;i<100;i++){
      for (int j=0;j<100;j++){
        System.out.println(objecten[i][j]);
      }       
    }
  }
}

