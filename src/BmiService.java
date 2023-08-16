public class BmiService {
    public double calculate(double weightInKg, double heightlnMeters) {
        return (double) weightInKg / (heightlnMeters * heightlnMeters);
    }

}
