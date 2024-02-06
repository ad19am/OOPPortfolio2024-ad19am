import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Please enter the denominator: ");
        int denominator = scanner.nextInt();

        double decimalConversion = (double) numerator / denominator;

        System.out.println("The decimal equivalent of the fraction " + numerator + "/" + denominator + " is: " + decimalConversion);
        
        scanner.close();
    }
}
