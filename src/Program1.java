import java.util.Scanner;

public class Program1 {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner calling

        System.out.println("Input a number");
        int number = scan.nextInt();

        scan.close();

        String result = number%2==0 ? "Even" : "Odd"; // ternary operator to check number

        System.out.println(number + "is" + result);

    }



}
