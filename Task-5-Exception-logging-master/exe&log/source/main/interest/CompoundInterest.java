package interest;

public class CompoundInterest {
    public static double calculateInterest(double principalAmount, double time, double rateOfInterest)
    {
        return Double.parseDouble(String.format("%.2f", principalAmount * Math.pow(1.0+rateOfInterest/100.0,time) - principalAmount));
    }
}
