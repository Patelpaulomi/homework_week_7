public class Program19 {
    /**
     *  Write a Java program to calculate the average value of array elements.
     */

    public static void main(String[] args) {
        int a [] = {9,10,13,15,12,24};  // Using Array
        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        double avarage = sum / a .length;
        System.out.println("Average value of array elements is :" + avarage);
    }
}
