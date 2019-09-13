class Day {
  public static void main(String args[]) {
    int day = 3;
    System.out.println("day = " + day);
    switch(day) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Working day");
        break;
      case 6:
      case 7:
        System.out.println("Weekend");
        break;
      default:
        System.out.println("No existing day of the week");
    }
  }
}
