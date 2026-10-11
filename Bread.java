/*
 * Represents bread that can be sold at a bakery
 * Bread is a food you can buy at a bakery.
 */
public class Bread extends Bakery {
  
  private boolean isSliced;   // Whether or not the bread is sliced

  /*
   * Sets isSliced to true
   */
  public Bread() {
    isSliced = true;
  }

  /*
   * Sets the name to the specified name, price to the
   * specified price, and isSliced to the specified status
   */
  public Bread(String name, double price, boolean isSliced) {
    super(name, price);
    this.isSliced = isSliced;
  }

  /*
   * Returns the value assigned to isSliced
   */
  public boolean getIsSliced() {
    return isSliced;
  }

  /*
   * Sets isSliced to newIsSliced
   */
  public void setIsSliced(boolean newIsSliced) {
    isSliced = newIsSliced;

   
  }

 // Used a toString method to print out the current value of isSliced as the user inputs.
    public String toString() {
    return super.toString() + "\nIs Sliced? " + isSliced;
  
  }
  
}