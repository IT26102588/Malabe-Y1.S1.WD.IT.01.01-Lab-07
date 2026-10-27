import java.util.Scanner;

public class IT26102588Lab7Q3 {
    public static void main(String[] args) {

        final double DISCOUT_RATE = 0.05;
        final int NUMBER_OF_CUSTOMERS = 5;
        double billAmount, amounttoPay;
        char PayementMode;

        double discount = 0;

        Scanner input = new Scanner(System.in);

        for (int customercount = 1;
             customercount <= NUMBER_OF_CUSTOMERS;
             customercount++) {

            System.out.println("customer :" + customercount);

            System.out.println("Enter the total Bill Amount :");
            billAmount = input.nextDouble();

            System.out.println("Enter the mode of payment(C for cash, O for other :)");
            PayementMode = input.next().toUpperCase().charAt(0);

            if (PayementMode == 'C') {
                // Calculate discount
                discount = billAmount * DISCOUT_RATE;
                amounttoPay = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be Paid : " + amounttoPay);

            } else if (PayementMode == 'O') {
                // No discount
                amounttoPay = billAmount;

                System.out.println("No Discount Applicable");
                System.out.println("Amount to be Paid : " + amounttoPay);

            } else {
                // Invalid option
                System.out.println("Payment Mode is Not Valid");
                System.out.println("");

                continue; // Skip to the next customer
            }

            System.out.println("");
        }
    }
}