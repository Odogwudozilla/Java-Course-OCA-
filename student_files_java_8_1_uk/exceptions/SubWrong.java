import java.io.*;


class Super {
   public String info() throws IOException {
      return "test in super";
   }
}

class Sub extends Super {
   @Override
   public String info() throws IOException {
      return "test in sub";
   }   
}

class SubWrong {
    public static void main(String args[]){
	   Super s = new Sub();
	   show(s);
    }
	
    private static void show (Super s ){
	
    }
}
