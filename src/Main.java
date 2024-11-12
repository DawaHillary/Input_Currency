import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // A program that takes currency in UGX and converts it to USD using a conversion rate.


        Scanner CurrencyConverter = new Scanner(System.in);

        System.out.print("Enter the amount of UGX you want to convert: ");
        double UgxCurrency = CurrencyConverter.nextDouble(); //


        // Conversion rate (UGX per USD)
        double conversionRate = 0.00028;

        double USDCurrency = UgxCurrency * conversionRate;

        System.out.printf("The equivalent amount of the UGX: " + UgxCurrency + " in USD is: USD" + USDCurrency);

        CurrencyConverter.close(); // Close the scanner when done with it.



    }
}