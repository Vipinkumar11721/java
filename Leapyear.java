
// Write a program to check  the given year is leap year or not leap year.
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("leapyear");
        } else {
            System.out.println("not leapyear");
        }

    }

}
