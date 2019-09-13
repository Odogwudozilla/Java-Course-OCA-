import java.util.function.*;
import java.util.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class Article {
  private String name;
  private double price;
  private LocalDate sold;
  public Article(String name, double price){
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

class ArticleApp {

  public static void main (String args[]){
    Article a1 = new Article ("pen", 1.5f);
    a1.setSold(2014,5,1);
    Article a2 = new Article ("pencil", 1.3f);
    a2.setSold(LocalDate.now());
    List<Article> articles = new ArrayList<>();
    articles.add(a1);
    articles.add(a2);
    System.out.println("articles before change:");
    System.out.println(articles);
    modify(articles, 
        a -> a.lastSold()>30, 
        a -> a.setPrice(a.getPrice()*0.9));
    System.out.println("articles after change:");
    System.out.println(articles);
  }

  public static void modify(List<Article> list, 
      Predicate<Article> p, 
      Consumer<Article> c){
    for(Article a:list){
      if(p.test(a)){
        c.accept(a);
      }
    }
  }
}
