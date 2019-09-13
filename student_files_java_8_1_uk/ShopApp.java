import java.time.*;

class Item {
  // attributes (or fields) name and price
  final private String name;  // final: can't be changed
  private double price;       // private: can only be used directly within this class

 
  // constructor, to create objects, like this: Item pen = new Item("pen", 1.5);
  public Item(String name, double price){ // here, name and price are the parameters of the constructor
    this.name = name;        // assign the values of the parameters 
    this.price = price;      // to the attributes of the new object            
  }

  // method that returns the value of an attribute
  public String getName(){
    return name;
  }

  public double getPrice(){
    return price;
  }

  // method that sets the value of an attribute
  public void setPrice(double price){
    if(price>=0){
      this.price = price;
    }
  }

  // overriding: change the behavior of this method 
  // (toString is a method of Object: the superclass of every class)
  @Override 
  public String toString(){
    // return String information about this object
    return String.format("%-10s: %.2f", name, price); 
  }

}


// Food is a subclass of Item: it also has a name and a price
// on top of that, Food has an experationDate
class Food extends Item {
  private LocalDate expirationDate;

  public Food(String name, double price, LocalDate expirationDate){
    super(name, price);
    this.expirationDate = expirationDate;
  }

  public LocalDate getExpirationDate(){
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate){
    this.expirationDate = expirationDate;
  }

  // give discount when expiration date is approaching
  @Override 
  public double getPrice(){
    if(expired()){ // use private boolean method to know if expiration date is coming soon
      return super.getPrice() * 0.65; // 35 % discount
    } else {
      return super.getPrice();        // original price
    }
  }

  private boolean expired(){
    return Period.between(LocalDate.now(),expirationDate).getDays()<=3;
  }
}

class CashRegister {
  private final StringBuilder receipt = new StringBuilder();
  private double totalPrice = 0;

  public void scan(Item item){
     receipt.append(item);           // uses item.toString() to append to the receipt
     receipt.append("\n");           // add a new line
     totalPrice += item.getPrice();  // increase totalPrice with price of the item
  }

  public void pay(){
    receipt.append("-----------\n")
           .append(String.format("%-10s: %.2f%n","total", totalPrice));
    System.out.println(receipt);
    // reset for next customer
    totalPrice=0;
    receipt.setLength(0);
  }
}


public class ShopApp {
  // the main application
  public static void main(String args[]){
    CashRegister register = new CashRegister();
    Item pen = new Item("pen", 1.5);
    Item pencil = new Item("pencil", 0.5);
    Item milk = new Food("milk", 1.8, LocalDate.now());

    register.scan(pen);
    register.scan(pencil);
    register.scan(milk);
    register.pay();
  }
}
