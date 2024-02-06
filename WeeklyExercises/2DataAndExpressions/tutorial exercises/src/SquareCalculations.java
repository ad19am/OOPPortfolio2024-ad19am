import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the square's side: ");
        
        int sideLength = scanner.nextInt();

        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;
        
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
        
        scanner.close();
    }
}

