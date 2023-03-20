import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class Program17 {
       // Using Arrays
    public static void main(String[] args) {
        int [] myArray1 = {
                50,20,40,10,30,};
        String[] myArray2 = {
                "Paulomi, Mansi, Kruti, Manju, Bhavesha"};

        System.out.println("Original numeric array :" + Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("sorted numeric array :" + Arrays.toString(myArray1));
        System.out.println("Original String array" + Arrays.toString(myArray2));
        Arrays.sort(myArray1);
        System.out.println("sorted string array :" +Arrays.toString(myArray2));
    }
}
