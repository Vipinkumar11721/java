//Write a program to make a calculator ?
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input the value of a=");
        int a = Sc.nextInt();
        System.out.print("Input the value of b=");
        int b = Sc.nextInt();
        System.out.print("input your operator =");
        char operator = Sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Your value is " + (a + b));
                break;

            case '-':
                System.out.println("Your value is " + (a - b));
                break;

            case '*':
                System.out.println("Your value is " + (a * b));
                break;
            case '/':
                System.out.println("Your value is " + (a / b));
                break;

            default:
                System.out.println("wrong operator");
                break;
        }

    }
}