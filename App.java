import java.util.Scanner;

public class App{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in feet (ft):");
        double feet = scanner.nextDouble();
        System.out.println("Enter the rest height in inches (in):");
        double inches = scanner.nextDouble() + (feet*12);
        System.out.println("Enter your weight in pounds (lb):");
        double pounds = scanner.nextDouble();
        double BMI = pounds/Math.pow(inches, 2)*703;
        System.out.println("Your BMI is: " + BMI);
    }
}