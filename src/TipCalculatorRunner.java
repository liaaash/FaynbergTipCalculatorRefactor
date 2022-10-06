import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        ArrayList<Double> costs = new ArrayList<Double>();
        System.out.println("Welcome to the tip calculator! (hit enter to continue)");
        String ok = scan.nextLine();
        System.out.println("How many people are in your group? (Enter an integer)");
        int people = scan.nextInt();
        System.out.println("Enter the tip percentage as an integer.");
        int percent = scan.nextInt();
        TipCalculator group1 = new TipCalculator(people, percent);

        System.out.println("Enter the cost of each item in dollars and cents, and hit enter after every item (type -1 when finished).");
        double n;
        while ((n = scan.nextDouble()) != -1) {
            group1.addMeal(n);
        }


        /* I created the variable of initialBill and made a loop that adds every item from my ArrayList
        to the initialBill to create the total bill sum */

    }
}
