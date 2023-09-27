
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarations
        final double SALES_TAX_RATE = 0.5;
        double purchasePrice = 0;
        double salesTaxAmount = 0;

        // Using Scanner for Getting Input from User
        System.out.println("Enter the purchase price");
        Scanner in = new Scanner(System.in);
        purchasePrice = in.nextDouble();



        // Calculate Sales Tax Amount
        salesTaxAmount = purchasePrice * SALES_TAX_RATE;

        // Output To User
        System.out.println("The sales tax for the purchase price of $" + purchasePrice + "is $" + salesTaxAmount + ".");

        // Close the scanner
        in.close();

    }
}