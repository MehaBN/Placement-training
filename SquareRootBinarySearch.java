import java.util.Scanner;

  public class SquareRootBinarySearch {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a positive number: ");
          double number = scanner.nextDouble();

         System.out.print("Enter the precision (e.g., 0.0001): ");
         double precision = scanner.nextDouble();

        double low = 0;
         double high = number;
         double mid;

         if (number < 1 && number > 0) {
             high = 1;
         }

         while ((high - low) > precision) {
            mid = (low + high) / 2;
             if (mid * mid > number) {
                 high = mid;
             } else {
                 low = mid;
             }
         }

         double sqrt = (low + high) / 2;
         System.out.printf("Square root of %.1f is approximately: %.5f%n", number, sqrt);
     }
 }