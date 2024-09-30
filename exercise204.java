import java.util.Scanner;

public class exercise204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = sc.nextDouble();

        double cost = (distance / miles) * price;

        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}