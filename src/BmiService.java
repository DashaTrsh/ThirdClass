public class BmiService {
    public double calculate (double height_m, double weight_kg) {
        double index = weight_kg/ Math.pow(height_m,2);
        return index;
    }
}
