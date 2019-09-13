class LeapYear {
  public static void main(String args[]){
    for (int year = 2000; year <3000; year ++) {
      if (year%100 == 0 && year%400 != 0)
        continue;
      if (year%4 == 0)
        System.out.println(year + " is a leap year");
    } 
  }
}
