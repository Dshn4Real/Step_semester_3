import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter weight of person " + i + " in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height of person " + i + " in meters: ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.printf("Person %d BMI: %.2f%n", i, bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }

            System.out.println();
        }

        sc.close();
    }
}