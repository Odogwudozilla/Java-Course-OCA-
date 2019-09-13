import java.util.*;

class AddUpApp {

   public static void main(String args[]){
     List<Integer> numbers = new ArrayList<Integer>();
     numbers.add(new Integer(3));
     numbers.add(new Integer(6));
     numbers.add(new Integer(5));

     int sum = 0;
     Iterator<Integer> iterator = numbers.iterator();
     while(iterator.hasNext()){
       sum+= iterator.next().intValue();
     }
     System.out.println(sum);
   }
}
