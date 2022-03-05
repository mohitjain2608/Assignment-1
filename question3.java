package Assessment_1;

import java.util.Scanner;

/**
 * Develop a program, that accepts a deposit amount and calculates amount of interest
 * the deposit amount earns in a year. The bank pays a flat 4% interest for deposits of up
 * to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, and a flat 5% for deposits
 * of more than Rs.5000.
 */
public class question3 {
    public static double callInterest(int amt) {
        if (amt < 1000)
            return (0.04 * amt);
        else if ((amt > 1000) && (amt < 5000))
            return (0.045 * amt);
        else
            return (0.05 * amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt = sc.nextInt();
        System.out.println("The interest amount is " + callInterest(amt));
    }
}
