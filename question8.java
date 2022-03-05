package Assessment_1;

import java.util.Scanner;

/**
 * Electricity board wants to develop program to calculate Electricity Bill. They have two
 * types of connections domestic and commercial, charges for domestic bill are as follows
 * if consumed units are less or equals 100 then Rs.4/units or Rs. 250 whichever is greater
 * if consumed units are between 100 to 300 then Rs.4.50/units
 * if more than 300 and less than 500 Rs.4.75/units and above 500 Rs.5/units.
 * For commercial connections charges are calculated as follows
 * Consumed units are less or equals 100 then Rs.4.25/units or Rs. 350 whichever is
 * greater.
 * if consumed units are between 100 to 300 then Rs.4.75/units.
 * if more than 300 and less than 500 Rs.5/units and above 500 Rs.5.25/units calculate
 * electricity bill
 */
public class question8 {
    public static double calculateBill(String connectionType, int consumedUnits) {
        double bill;
        if (connectionType.contains("domestic")) {
            if (consumedUnits < 100) {
                bill = consumedUnits * 4;
                return Math.max(bill, 250);
            } else if ((consumedUnits > 100) && (consumedUnits < 300)) {
                return consumedUnits * 4.50;
            } else if ((consumedUnits > 300) && (consumedUnits < 500)) {
                return consumedUnits * 4.75;
            } else {
                return consumedUnits * 5;
            }
        } else if (connectionType.contains("commercial")) {
            if (consumedUnits < 100) {
                bill = consumedUnits * 4.25;
                return Math.max(bill, 350);
            } else if ((consumedUnits > 100) && (consumedUnits < 300)) {
                return consumedUnits * 4.75;
            } else if ((consumedUnits > 300) && (consumedUnits < 500)) {
                return consumedUnits * 5;
            } else {
                return consumedUnits * 5.25;
            }
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity connection type - domestic or commercial");
        String type = sc.next();
        System.out.println("Enter consumed units: ");
        int units = sc.nextInt();
        System.out.println("Total electricity bill: Rs." + calculateBill(type, units));
    }

}
