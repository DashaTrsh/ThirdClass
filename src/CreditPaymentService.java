public class CreditPaymentService {
    public double calculate (int sum, double intRate, int timeMonths) {
        double payment = (sum * intRate + sum ) / timeMonths;
        int wholePayment = (int) payment;
        return wholePayment;
    }
}
// interest rate is always 9.99%, sum 1_000_000, payment x, time x months
