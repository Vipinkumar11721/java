//Write a java program to check the person are adult or not ?
import java.util.*;
public class Adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of person =");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Person is adult");

        } else {
            System.out.println("Person is not adult");
        }

    }

}
