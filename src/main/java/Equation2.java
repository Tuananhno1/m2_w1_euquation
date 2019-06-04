import java.util.Scanner;
public class Equation2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double a,b,c;
        System.out.printf("a: ");
         a = scanner.nextDouble();

        System.out.printf("b: ");
         b = scanner.nextDouble();

        System.out.printf("c: ");
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
