public class BmiService {
    public double calculate(double weight, double height) {
        double squareHeight = height * height;
        double bmi = weight / squareHeight;
        return bmi;
    }
}
