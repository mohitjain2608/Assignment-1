package Assessment_1;

import java.util.Scanner;

/**
 * An old-style movie theater has a simple profit program. Each customer pays $5 per
 * ticket. Every performance costs the theater $20, plus $.50 per attendee. Develop the
 * program that accepts the number of attendees (of a show) and calculates how much
 * income the show earns
 */
public class question7 {
    public static float calculateProfit(int numAttendees) {
        int costOfTotalTickets = 5 * numAttendees;
        int costPerPerformance = 20;
        float costPerAttendee = (float) .50 * numAttendees;
        float totalIncome = costOfTotalTickets - costPerPerformance - costPerAttendee;
        return totalIncome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of attendee:");
        int num = sc.nextInt();
        System.out.println("Total income: $" + calculateProfit(num));
    }

}
