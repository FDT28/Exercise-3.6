import java.util.Scanner;

public class App{
    public static void main(String[]args) {
        Scanner scannerfeet = new Scanner(System.in);
        Scanner scannerinches = new Scanner(System.in);
        Scanner scannerpounds = new Scanner(System.in);
        System.out.println("Enter your height in feet (ft):");
        double feet = scannerfeet.nextDouble();
        System.out.println("Enter the rest height in inches (in):");
        double inches = scannerinches.nextDouble() + (feet*12);
        System.out.println("Enter your weight in pounds (lb):");
        double pounds = scannerpounds.nextDouble();
        double BMI = pounds/Math.pow(inches, 2)*703;
        System.out.println("Your BMI is: " + BMI);
    }
}