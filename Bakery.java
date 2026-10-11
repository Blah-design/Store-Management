/*
 * Represents a place you can buy foods such as pastries, Muffins, and Bread which is a bakery
 */
public class Bakery {

  private String name;    // The name of food
  private double price;     // The price of a food

  /*
   * Sets name to "Chocolate Croissant" and price to 4.00
   */
  public Bakery() {
    this("Chocolate Croissant", 4.00);
  }

  /*
   * Sets name to the specified name and
   * price to the specified price
   */
  public Bakery(String name, double price) {
    this.name = name;
    this.price = price;
  }

  /*
   * Returns the value assigned to name
   */
  public String getName() {
    return name;
  }

  /*
   * Returns the value assigned to price
   */
  public double getPrice() {
    return price;
  }

  /*
   * Sets name to newName
   */
  public void setName(String newName) {
    name = newName;
  }

  /*
   * Sets price to newPrice
   */
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }


// toString method for Super class
  public String toString() {
    return "Name: " + name + "\nPrice: " + price;
  }


  
}