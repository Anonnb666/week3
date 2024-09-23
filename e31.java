package week3;

import java.util.Scanner;

public class e31 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis()/10%10);
        Scanner sc = new Scanner(System.in);
        System.out.println("what is "+number1+"+"+number2+"?");
        int answer = sc.nextInt();
        System.out.println(number1+"+"+number2+"="+answer+" is "+(number1+number2==answer?"correct":"wrong"));
    }
}
