import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testing methods from InputHelper
        Scanner scan = new Scanner(System.in);
        /*
        //testing getInt
        int x = InputHelper.getPositiveNonZeroInt(scan, "Please enter a positive, non-zero integer.");
        System.out.println("My number is: " + x);

        //testing getRegExString
        String y = InputHelper.getRegExString(scan, "Please enter your birthday in __-__-____ format:", "\\d{2}-\\d{2}-\\d{4}");
        System.out.println("Your birthday is " + y);

        //Testing getNonZeroLenString
        String z = InputHelper.getNonZeroLenString(scan, "Please enter something random:");
        System.out.println("You entered: " + z);
         */
        //Testing getYNConfirm
        boolean a = InputHelper.getYNConfirm(scan, "Do you like dogs?");
        System.out.println("Your answer is " + a);
    }
}
