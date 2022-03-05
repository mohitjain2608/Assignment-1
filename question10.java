package Assessment_1;

/**
 * Write a program to create a rectangular array containing a multiplication table from 1*1
 * up to 12*12. Output the table as 13 columns with the numeric values right-aligned in
 * columns. (The first line of output will be the column headings, the first column with no
 * heading, then the numbers 1 to 12 for the remaining columns. The first item in each of the
 * succeeding lines is the row heading, which ranges from 1 to 12.
 */
public class question10 {
    public static void displayMultiplicationMatrix() {
        int[][] table = new int[12][12];
        for (int i = 0; i < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < table.length; ++i) {
            System.out.format("%2d :", i + 1);

            for (int j = 0; j < table[i].length; ++j) {
                System.out.format("%5d", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayMultiplicationMatrix();
    }
}

