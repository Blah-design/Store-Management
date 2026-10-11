/*
 * Represents a Pastry that can be sold at a Bakery
A Pastry is a type of food that is sold in a bakey
 */
public class Pastry extends Bakery {

  private boolean hasFilling;   // Whether or not a Pastry has filling or not.

  /*
   * Sets hasFilling to true
   */
  public Pastry() {
    hasFilling = true;
  }

  /*
   * Sets the flavor to the specified flavor, the price to the
   * specified price, and isMini to the specified status
   */
  public Pastry(String name, double price, boolean hasFilling) {
    super(name, price);
    this.hasFilling = hasFilling;
  }

  /*
   * Returns the value assigned to hasFilling
   */
  public boolean getHasFilling() {
    return hasFilling;
  }

  /*
   * Sets hasFilling to newHasFilling
   */
  public void setHasFilling(boolean newHasFilling) {
    hasFilling = newHasFilling;
  }
  // Used a toString method to print out the current value of hasFilling as the user inputs.
    public String toString() {
    return super.toString() + "\nHas Filling? " + hasFilling;
}

}