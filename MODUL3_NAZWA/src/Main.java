import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean repetition = true;
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n=====Menu Program=====" + "\n1. Square" + "\n2. Circle" + "\n3. Trapezoid" + "\n0. Exit" + "\nSelect Menu: ");
        int option = scanner.nextInt();

        switch (option) {
          case 1:
            System.out.print("\nEnter the length of the side of the square: ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getSquare());
            break;

          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getCircle());
            break;

          case 3:
            System.out.print("\nEnter the upper side of the trapezoid: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the side of the base of the trapezoid: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid: ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
            break;

          case 0:
            System.out.println("\nProgram End");
            break;

          default:
            System.out.println("\nPlease input the available options");
            continue;
        }
        repetition = false;

      } catch (InputMismatchException e) {
        System.out.println("\n===== Error!!! Input must be a number =====");
        scanner.next();

      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repetition);

    scanner.close();
  }
}