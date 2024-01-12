//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double  mass = 100;
        double height = 1.90;
        double bmi = service.calculate(mass,height);
        System.out.printf("Body Mass Index %.0f",bmi);
    }
}