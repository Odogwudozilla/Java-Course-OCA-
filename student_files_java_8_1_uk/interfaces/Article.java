abstract class Priced {
  abstract float getPrice();
}

class Article extends Priced {
  private String type;
  private String brand;
  private float price;

  Article(){}

  Article(String type, String brand, float price){
    this.type=type;
    this.brand=brand;
    this.price=price;
  }

  public String getType(){
    return type;
  }

  public String getBrand(){
    return brand;
  }

  public float getPrice(){
    return price;
  }
}

