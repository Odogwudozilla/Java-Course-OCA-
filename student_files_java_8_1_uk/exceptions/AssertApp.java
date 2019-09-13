public class AssertApp {
  public static void main (String args[]) {
    for(int i=0;i<20;i++){
	  roleDice();  
	}
  }
  public static void roleDice(){
	int turn = (int)Math.random()*6;
	showDice(turn);
  }
 private static void showDice(int i){
   assert i>0 : "dice has become zero or less: " + i;
   switch(i){
     case 1: System.out.println("."); break;
     case 2: System.out.println(".."); break;
     case 3: System.out.println("..."); break;
     case 4: System.out.println("...."); break;
     case 5: System.out.println("....."); break;
     case 6: System.out.println("......"); break;
     default: assert false: "dice has become 7 or more: " + i;
   }
 }
}
