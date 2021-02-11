// Jake Prisby
// 2/11/2021
// PriceFinder Program

// Imports
import java.util.Scanner;
import PriceFinder.PriceFinder;

// Class for the User Interface in the Console
public class BookSeller {

   // Main Class
   public static void main( String[] args ) {
      
      Scanner input = new Scanner(System.in); // Scanner used to recieve user input in console
      System.out.print("Enter the number of copies to be printed: ");
      
      PriceFinder pfdr = new PriceFinder(input.nextInt()); // PriceFinder object 
      
      System.out.println("Price per copy is: " + pfdr.getPrice()); 
      System.out.println("Total cost is: $" + pfdr.getCost());
   
   }


}