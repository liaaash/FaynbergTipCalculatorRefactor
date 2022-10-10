import java.util.ArrayList;

public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    public ArrayList<Double> costs;

    public TipCalculator(int group, int percent) {
     numPeople = group;
     tipPercentage = percent;
     totalBillBeforeTip = 0.0;
     costs = new ArrayList<Double>();
    }


    public void addMeal(double cost) {
        costs.add(cost);
    }

    public double getTotalBillBeforeTip() {
        // for loop add up values
        for (Double i : costs) {
            totalBillBeforeTip += i;
        }
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public double tipAmount() {
        return totalBillBeforeTip * (tipPercentage / 100.0);
    }

    public double totalBill(){
       return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost(){
        return totalBill() / numPeople;
    }
}

