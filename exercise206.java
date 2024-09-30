import java.util.Scanner;

public class exercise206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthly = input.nextDouble();

        double Rate = 0.05;
        double monthly2 = Rate / 12;

        double Value = 0;
        for (int month = 1; month <= 6; month++) {
            Value = (Value + monthly) * (1 + monthly2);
        }
        System.out.printf("After the sixth month, the account value is $%.2f\n", Value);

    }

}
