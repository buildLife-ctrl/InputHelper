import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testing methods from InputHelper
        Scanner scan = new Scanner(System.in);

        //testing getInt
        int x = InputHelper.getPositiveNonZeroInt(scan, "Please enter a positive, non-zero integer.");
        System.out.println("My number is: " + x);
    }
}
