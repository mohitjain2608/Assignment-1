package Assessment_1;

import java.util.Scanner;

/**
 * Find the number is prime or no.
 */
public class question5 {
    public static boolean isPrimeNumber(int num) {
        int i, count = 0;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && num != 0 && num != 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if (isPrimeNumber(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

}
