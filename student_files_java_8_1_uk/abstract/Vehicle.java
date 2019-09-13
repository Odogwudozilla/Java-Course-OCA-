public abstract class Vehicle {

  public abstract void stop();
  public abstract void start();
  
  public String toString() {
    return "Vehicle";
  }
}

class VehicleApp {
  public static void main(String args[]){
    Vehicle v = new Vehicle();
  }
}
