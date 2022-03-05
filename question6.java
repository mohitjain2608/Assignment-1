package Assessment_1;

import java.util.Scanner;

/**
 * Method will accept range value and print all prime numbers from 2 to range on console.
 */
public class question6 {
    public static void printPrime(int maxVal) {
        int count = 0;
        System.out.println("The prime numbers between 2 to " + maxVal + " are:");
        for (int i = 2; i <= maxVal; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range value:");
        int num = sc.nextInt();
        printPrime(num);
    }

}
