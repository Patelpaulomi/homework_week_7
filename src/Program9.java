import java.util.Scanner;

public class Program9 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
     * 9. Same as above program-8 using switch statement.
     */

    public static void main(String[] args) {
        Program9 obj = new Program9();
        obj.alphabet();
    }

    public void alphabet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input city name between A and F");
        String letter = scan.nextLine();

        switch (letter.toUpperCase()) {
            case "A":
                System.out.println("America");
                break;
            case "B":
                System.out.println("Belgium");
                break;
            case "C":
                System.out.println("Caneda");
                break;
            case "D":
                System.out.println("Dubai");
                break;
            case "E":
                System.out.println("England");
                ;
                break;
            default:
                scan.close();
        }
    }
}
