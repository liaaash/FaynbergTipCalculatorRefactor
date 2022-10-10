import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        ArrayList<Double> costs = new ArrayList<Double>();
        //
        System.out.println("Welcome to the tip calculator! (hit enter to continue)");
        String ok = scan.nextLine();
        System.out.println("How many people are in your group? (Enter an integer)");
        int people = scan.nextInt();
        System.out.println("Enter the tip percentage as an integer.");
        int percent = scan.nextInt();
        TipCalculator group1 = new TipCalculator(people, percent);
        System.out.println("Enter the cost of each item in dollars and cents, and hit enter after every item (type -1 when finished).");
        double num = 0.0;
        while (num != -1) {
            group1.addMeal(num);
            num = scan.nextDouble();
        }
        System.out.println("----------");
        System.out.println("Total bill before tip: $" + formatter.format(group1.getTotalBillBeforeTip()));
        System.out.println("Tip percentage: " + formatter.format(group1.getTipPercentage()));
        System.out.println("Total tip: $" + formatter.format(group1.tipAmount()));
        System.out.println("Total bill with tip: $" + formatter.format(group1.totalBill()));
        System.out.println("Per person cost before tip: $" + formatter.format(group1.perPersonCostBeforeTip()));
        System.out.println("Tip per person: $" + formatter.format(group1.perPersonTipAmount()));
        System.out.println("Total cost per person: $" + formatter.format(group1.perPersonTotalCost()));
        System.out.println("----------");



    }
}
