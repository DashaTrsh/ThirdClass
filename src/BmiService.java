public class BmiService {
    public double calculate (double height_m, double weight_kg) {
        double index = weight_kg/ (height_m * height_m);
        return index;
    }
}
