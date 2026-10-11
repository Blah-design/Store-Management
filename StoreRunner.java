import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

Muffin j = new Muffin(); 
System.out.println("name: "); 
String name2 = input.nextLine();
j.setName(name2);  
System.out.println("Price: "); 
double price2 = input.nextDouble(); 
j.setPrice(price2);  
System.out.println("Is Mini: "); 
boolean isMini = input.nextBoolean(); 
j.setIsMini(isMini); 
input.nextLine();
Pastry h = new Pastry(); 
System.out.println("name:" ); 
String name3 = input.nextLine(); 
h.setName(name3); 
System.out.println("Price: "); 
double price3 = input.nextDouble(); 
h.setPrice(price3); 
System.out.println("Has Filling: "); 
boolean isFilling = input.nextBoolean(); 
h.setHasFilling(isFilling); 
input.nextLine(); 
Bread k = new Bread(); 
System.out.println("name: "); 
String name4 = input.nextLine(); 
k.setName(name4); 
System.out.println("Price: "); 
double price4 = input.nextDouble(); 
k.setPrice(price4); 
System.out.println("Is Sliced: "); 
boolean isSliced = input.nextBoolean(); 
k.setIsSliced(isSliced);


System.out.println("\n----- Your Order -----");

    // Uses the toString method in the Muffin class to print out the current value of Muffin.
System.out.println(j);
System.out.println();

    // Used the toString method in the Pastry class to print out the current value of Pastry.
System.out.println(h);
System.out.println();
    // Used the toString method in the Bread class to print out the current value of Bread.
System.out.println(k);
System.out.println();

    // Takes the total of all the prices the user inputed and displays it.
double total = j.getPrice() + h.getPrice() + k.getPrice();
System.out.println("----------------------");
System.out.println("Total: $" + total);
    
    // Closes the Scanner object
    input.close();
    
  }
}