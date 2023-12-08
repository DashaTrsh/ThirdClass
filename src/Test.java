public class Test {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int timeMonths = 12;
        double intRate = 0.999;
        double payment = service.calculate(sum, intRate, timeMonths);
        System.out.println(payment);
    }
}
