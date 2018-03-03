import java.util.*;
import java.math.*;

public class DayTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // ORIGINAL MEAL PRICE
        int tipPercent = scan.nextInt(); // TIP PERCENTAGE
        int taxPercent = scan.nextInt(); // TAX PERCENTAGE
        scan.close();
      
        // Write your calculation code here.

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        // Print your result
        
        System.out.println("The total meal cost is "+ totalCost + " dollars.");
    }
}