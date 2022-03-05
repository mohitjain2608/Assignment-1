package Assessment_1;

import java.util.Scanner;

/**
 * Develop the program, which accepts the gross pay and produces the amount of tax
 * owed. For a gross pay of $240 or less, the tax is 0%; for over $240 and less than
 * $480, the tax rate is 15%; and for any pay over $480, the tax rate is 28%
 */
public class question4 {
    public static double callTax(int gp) {
        if (gp < 240)
            return (0);
        else if ((gp > 240) && (gp < 480))
            return (0.15 * gp);
        else
            return (0.28 * gp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt = sc.nextInt();
        System.out.println("The amount of tax owned: " + callTax(amt));
    }
}
