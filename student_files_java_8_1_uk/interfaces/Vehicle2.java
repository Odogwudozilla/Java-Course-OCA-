interface Vehicle {
  void start() ;
  void stop() ;
}

class Car implements Vehicle {
  public void start(){ System.out.println("car starts") ; }
  public void stop(){  System.out.println("car stops") ; }
}

