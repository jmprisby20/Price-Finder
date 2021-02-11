// Jake Prisby
// 2/11/2021
// PriceFinder Program

package PriceFinder;

// Class (public) for the PriceFinder Object
public class PriceFinder {
    
    // Internal Fields
    private double price; // Double that will hold the price of each individual book based on the total quantity of books
    private final double totalCost; // Double that will hold the final purchase cost of the bulk order of books
    
    // Constructor
    public PriceFinder(int i){
        // Check the total quantity of books ordered
        if ( i < 100){
            // Here there are less than 100 books that were ordered, price per book = $0.30
            price = 0.3;
        }else if (i > 99 && i < 500){
            // Here there are between 100 and 499 books that were ordered, price per book = $0.28
            price = 0.28;
        }else if(i > 499 && i < 750){
            // Here there are between 500 and 749 books that were ordered, price per book = $0.27
            price = 0.27;
        }else if (i > 749 && i < 1001){
            // Here there are between 750 and 1000 books that were orderd, price per book = $0.26
            price = 0.26;
        }else if (i > 1000){
            // Here there are more than 1000 books that were ordered, price per book = $0.25
            price = 0.25;
        }
        
        totalCost = i * price; // Calculate total price with the quantity and the total number of books
        
    }
   
   // Accessors
   public double getCost(){ return totalCost; } 
   public double getPrice(){ return price; } 
}
