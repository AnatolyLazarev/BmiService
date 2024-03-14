public class BmiService {
    public double calculate(int weight, double height) {

        double height2 = height * height;
        return (int) (weight / height2);
    }
}