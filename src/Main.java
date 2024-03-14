public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight;
        double height;
        double result = service.calculate(weight = 100, height = 1.90);
        System.out.println("Ваш BMI-индекс: " + result);

    }
}


//Ваш BMI-индекс: 27.0
//
//Process finished with exit code 0