/**
 *  Write a Java program to sum values of an array.
 */

public class Program18 {

    public static void main(String[] args) {
        int a [] = {10,20,30,40,50,60,70,80,90};  // Using Array
                int sum = 0;

        for(int i=0; i< a.length; i++)
            sum = sum+a[i];
        System.out.println("The sum is  " + sum);
    }
}
