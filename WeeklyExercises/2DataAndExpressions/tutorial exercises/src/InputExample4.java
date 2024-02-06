import java.util.Scanner;
public class InputExample4 {
    public static void main(String[] args) {
        System.out.println("What is your name:");

        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine();

        int count = 0;
        while (count < personName.length()) {
            System.out.println(personName.charAt(count));
            count++;
        }

        scan.close()
    }

}