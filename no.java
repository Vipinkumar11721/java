// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class no {
   public no() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      if (var2 == var3) {
         System.out.println("Equal");
      } else if (var2 > var3) {
         System.out.println("a is greater");
      } else {
         System.out.println("b is greater");
      }

   }
}
