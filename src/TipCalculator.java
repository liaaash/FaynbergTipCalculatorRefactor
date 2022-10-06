import java.util.ArrayList;

public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    public ArrayList costs;

    public TipCalculator(int group, int percent) {
     numPeople = group;
     tipPercentage = percent;
     costs = new ArrayList<Double>();
    }


    public void addMeal(double cost) {
        costs.add(cost);
    }

    public double getTotalBillBeforeTip() {
        // for loop add up values
        double initialBill = 0;
        for (Double i : costs) {
            initialBill += i;
        }
        return initialBill;
    }



}
