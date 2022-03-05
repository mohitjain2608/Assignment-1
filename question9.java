package Assessment_1;

import java.util.Scanner;

/**
 * Some credit card companies pay back a small portion of the charges a customer makes
 * over a year. A particular credit card company's pay back policy is as follows:
 * 1.0.25% for charges up to Rs. 500.
 * 2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500),
 * 3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500),
 * 4.1.0% for charges above Rs2500.
 * Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
 * which is 0.25 x 1/100 x 400, and one who charges Rs1, 400 a year receives Rs. 5.75,
 * which is 1.25 = 0.25 x 1/100 x 500 for the first Rs. 500 and 0.50 x 1/100 x 900 = 4.50 for
 * the next Rs. 900. Determine by hand the pay backs amount for a customer who charged
 * Rs. 2000 and one who charged Rs. 2600.
 * Define the program, which accepts a charge amount and computes the corresponding
 * pay back amount.
 */
public class question9 {
    public static float chargeAmount(int Charges) {
        if (Charges < 500)
            return (float) (0.0025 * Charges);
        else if ((Charges > 500) && (Charges < 1500))
            return (float) ((0.0025 * 500) + (0.0050 * (Charges - 500)));
        else if ((Charges > 1500) && (Charges < 2500))
            return (float) ((0.0025 * 500) + (0.0050 * 1000) + (0.0075 * (Charges - 1500)));
        else
            return (float) ((0.0025 * 500) + (0.0050 * 1000) + (0.0075 * 1000) + (0.0100 * (Charges - 2500)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charge amount:");
        int amt = sc.nextInt();
        System.out.println("The payback amount: Rs." + chargeAmount(amt));

    }
}
