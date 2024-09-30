import java.util.Scanner;

public class exercise203 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter weight in pounds: ");
            double weight1 = input.nextDouble();
            System.out.print("Enter height in inches: ");
            double height1 = input.nextDouble();

            double weight2 = weight1 * 0.45359237;
            double height2 = height1 * 0.0254;

            double bmi = weight2 / (height2 * height2);

            System.out.printf("BMI is %.4f\n", bmi);
    }
}
