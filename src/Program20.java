public class Program20 {
    /**
     * Write a Java program to test if an array contains a specific value.
     */
    public static void main(String[] args) {
     // Arrays method
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int toFind = 8;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found");
    }
}