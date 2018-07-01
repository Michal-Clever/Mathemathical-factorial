import java.util.Scanner;

public class MathemathicalFactorial {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i);
            System.out.println(i + " " + factorial);
        }
        System.out.println("Mathemathical factorial :" + factorial);
    }
}
