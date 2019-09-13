import java.util.function.*;
import java.util.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class Item {
  private String name;
  private double price;
  private LocalDate sold;
  public Item(String name, double price){
    this.name=name;
    this.price=price;
  }
  public void setName(String name) {
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public double getPrice(){
    return price;
  }
  public void setSold(LocalDate sold){
    this.sold = sold;
  }
  public void setSold(int y, int m, int d){
    this.sold = LocalDate.of(y,m,d);
  }
  public int lastSold(){
    LocalDate today = LocalDate.now();
    return (int)DAYS.between(sold,today);
  }
  public String toString(){
    return String.format("[%s: %,3.2f]",name,price);
  }
}

class ItemApp {

  public static void main (String args[]){
    Item i1 = new Item ("pen", 1.5f);
    i1.setSold(2014,5,1);
    Item i2 = new Item ("pencil", 1.3f);
    i2.setSold(LocalDate.now());
    List<Item> items = new ArrayList<>();
    items.add(i1);
    items.add(i2);
    System.out.println("items before change:");
    System.out.println(items);
    modify(items, 
        i -> i.lastSold()>30, 
        i -> i.setPrice(i.getPrice()*0.9));
    System.out.println("items after change:");
    System.out.println(items);
  }

  public static void modify(List<Item> list
                          , Predicate<Item> p, Consumer<Item> c){
    for(Item i:list){
      if(p.test(i)){
        c.accept(i);
      }
    }
  }
}
