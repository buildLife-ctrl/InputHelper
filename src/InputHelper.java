import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Scanner;

public class InputHelper {
    public static void getNonZeroLenString() {

    }

    //prompts the user for input until valid input is received
    /* Error displayed when invalid input and prompted to try again
     * passes a scanner object used for user input
     * pass in a string object used as prompt displayed */
    public static int getInt(Scanner scan, String prompt) {
        int num = 0; //eventually returned to user after validated
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                check = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int num = 0; //eventually returned to user after validated
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num > 0) {
                    check = true;
                } else {
                    System.out.println("Please enter a positive, non-zero integer.");
                }
            } else {
                System.out.println("Invalid input, please try again");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int num = 0;
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= min && num <= max) {
                    check = true;
                }
            } else {
                System.out.println("Invalid input, please try again.");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }

    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        String input;
        boolean check = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (prompt.matches()) {
            } else {
                System.out.println("");
            }
            scan.nextLine();
        } while (!check);
    }
}
