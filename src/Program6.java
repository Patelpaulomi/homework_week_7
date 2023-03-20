import java.util.Scanner;

public class Program6 {
    //. Write a java program to input any number and find out if it’s odd or even

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();
        if (num % 2==0)
            System.out.println(num + " Is Even Number");
        else
            System.out.println(num + " Is Odd Number");

        scan.close();
    }




}



