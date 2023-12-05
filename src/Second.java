public class Second {
    public static void main(String[] args) {
            BmiService service = new BmiService();
            double height_m = 1.87;
            double weight_kg = 98;
            double index = service.calculate(height_m, weight_kg);
            int indexWhole = (int) index;
            System.out.println(indexWhole);
        }
}
