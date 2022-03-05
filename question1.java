package Assessment_1;

import java.util.Scanner;

/**
 * Find the maximum of three numbers.
 */

public class question1 {
    static int callMax(int x, int y, int z) {
        int max = 0;
        max = (x > y) ? (Math.max(x, z)) : (Math.max(y, z));
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int res = callMax(x, y, z);
        System.out.println("The maximum of three numbers is : " + res);
    }
}
