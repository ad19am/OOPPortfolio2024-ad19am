import java.util.Scanner;

public class MilesToKilometres {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETRES = 1.60935;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the distance in miles: ");
        
        double miles = scanner.nextDouble();
        double kilometres = miles * MILES_TO_KILOMETRES;

        System.out.println(miles + " miles is equal to " + kilometres + " kilometres.");
        
        scanner.close();
    }
}

