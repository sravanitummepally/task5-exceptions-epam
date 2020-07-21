package interest;

public class SimpleInterest {
    public static double calculateInterest(double principalAmount, double time, double rateOfInterest)
    {
        return Double.parseDouble(String.format("%.2f", principalAmount*time*rateOfInterest/100));
    }
}
