import java.util.ArrayList;

public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    public ArrayList<Double> costs;

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

    public int getTipPercentage(){
        return tipPercentage;
    }

    public double tipAmount() {
        double tipAmt = (getTotalBillBeforeTip() * tipPercentage ) / 100;
        return tipAmt;
    }

    public double totalBill(){
       double tBill = getTotalBillBeforeTip() + tipAmount();
       return tBill;
    }

    public double perPersonCostBeforeTip(){
        double personCostBefore = getTotalBillBeforeTip() / numPeople;
        return personCostBefore;
    }

    public double perPersonTipAmount() {
        double personTip = tipAmount() / numPeople;
        return personTip;
    }

    public double perPersonTotalCost(){
        double personCostAfter = totalBill() / numPeople;
        return personCostAfter;
    }
}

