import java.util.Scanner;

public class Program10 {
    /**
     * .Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
     * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
     */
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner((System.in));
        System.out.println("enter the first number");
        int x = scan.nextInt();
        System.out.println("enter the second number");
        int y = scan.nextInt();

        System.out.println("enter the symbol(+,-,*,/");
        ch = scan.next().charAt(0);
        if (ch == '+') {
            System.out.println("addition of " + x + "+" + y + "=" + (x + y));

        } else if (ch == '-') {
            System.out.println("substraction of " + x + "-" + y + "=" + (x - y));
        } else if (ch == '*') {
            System.out.println("multiplication of " + x + "*" + y + "=" + (x * y));
        } else if (ch == '/') {
            System.out.println("division of " + x + "/" + y + "=" + (x / y));

        } else {
            System.out.println("symbol is not avaiable");
        }
        scan.close();
    }
}
