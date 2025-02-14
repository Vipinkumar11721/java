// Write a java program to check the no. is even or odd ? 
import java.util.*;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}