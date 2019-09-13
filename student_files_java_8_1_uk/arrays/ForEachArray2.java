class ForEachArray2 {
  
   public static void main(String args[]) {
     int current=1;
     int[] array = new int[10];     // array of 10 integers
     for (int number: array) {      // for each number in the array
       number=current;              // assign current to number
       System.out.println(number); 
       current++;
     }
     
     for (int number:array) {       // for each number in the array
       System.out.println(number);  // show the value.
     }
     
   }
}
