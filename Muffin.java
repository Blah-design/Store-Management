/*
 * Represents a Muffin that can be sold at a Bakery
 * Muffin is a type of food that you can buy at a Bakery
 */
public class Muffin extends Bakery {

  private boolean isMini;   // Whether or not the muffin is mini

  /*
   * Sets isMini to true
   */
  public Muffin() {
    isMini = true;
  }

  /*
   * Sets the name to the specified name, the price to the
   * specified price, and isMini to the specified status
   */
  public Muffin(String name, double price, boolean isMini) {
    super(name, price);
    this.isMini = isMini;
  }

  /*
   * Returns the value assigned to isMini
   */
  public boolean getIsMini() {
    return isMini;
  }

  /*
   * Sets isMini to newIsMini
   */
  public void setIsMini(boolean newIsMini) {
    isMini = newIsMini;
  }

  // Used a toString method to print out the current value of isMini as the user inputs.
  public String toString() {
    return super.toString() + "\nIs Mini " + isMini;
}
}