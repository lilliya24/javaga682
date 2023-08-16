public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;
        double heightlnMeters = 1.87;
        int bmi = (int) service.calculate(weightInKg, heightlnMeters);

        System.out.println(bmi);

    }

}