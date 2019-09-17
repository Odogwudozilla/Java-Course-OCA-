final public class Address {
  private String number, street, town, postcode;

  public Address() {
    number = "";
    street = "";
    town = "";
    postcode = "";

  }

  public Address(String number, String street, String town, String postcode) {

    this.number = number;
    this.street = street;
    this.town = town;
    this.postcode = postcode;
  }

  public Address(String number, String street, String town) {
    this(number, street, town, "");
  }

  public Address(String number, String postcode) {
    this(number, "", "", postcode);
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  @Override
  public String toString() {
    return this.number + " " + this.street + "\n" + this.town + " " + this.postcode;
  }
}

class AddressApp {
  public static void main(String[] args) {
    Address a = new Address("1", "1111 AA");
    System.out.println(a);
    a.setStreet("Kalverstraat");
    a.setTown("Amsterdam");
    System.out.println(a);
  }
}
