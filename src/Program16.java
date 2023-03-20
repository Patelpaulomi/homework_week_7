import java.util.Scanner;

public class Program16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int x = scan.nextInt();
        if (x >= 0) {
            System.out.println(x + " is positiv");
        } else {
            System.out.println(x + " is negative");
        }
        scan.close();
    }
}
