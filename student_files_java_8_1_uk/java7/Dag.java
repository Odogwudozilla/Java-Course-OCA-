class Dag
{
  public static void main(String args[])
  {
    int dag = 3;
    System.out.println("dag = " + dag);

    switch(dag)
    {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Werkdag");
        break;
      case 6:
      case 7:
        System.out.println("Weekend");
        break;
      default:
        System.out.println("Geen bestaande dag van de week");
    }
  }
} 
