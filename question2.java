package Assessment_1;

import java.util.Scanner;

/**
 * Write a program to check whether the input alphabet is a vowel or not.
 */
public class question2 {

    public static boolean checkAlpha(char alph) {
        if (alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u' ||
                alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char alph = sc.next().charAt(0);
        if (checkAlpha(alph)) {
            System.out.println(alph + " is vowel");
        } else {
            System.out.println(alph + " is a consonant");
        }

    }

}
