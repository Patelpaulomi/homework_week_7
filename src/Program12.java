import java.util.Scanner;

public class Program12 {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Character :");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) {
            System.out.println((ch + "is A alphabet ."));

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A digit .");
        } else {
            System.out.println((ch + "is a special character ."));
        }
        scan.close();
    }
}
