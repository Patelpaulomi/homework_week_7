import java.util.Scanner;

public class Program7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void main(String[] args) {
        int commission;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input sales id");
        int salesid = scan.nextInt();

        System.out.println("Input seller name");
        String sellername = scan.next();

        System.out.println("input sales amount");
        int salesAmount = scan.nextInt();

        System.out.println("Input basic salary");
        int basic = scan.nextInt();

        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales commission is" + commission);
        } else if (salesAmount >= 30000 && salesAmount <= 49999) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commission is" + commission);
        } else if (salesAmount >= 20000 && salesAmount <= 39999) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commission is" + commission);
        } else if (salesAmount >= 10000 && salesAmount <= 9999) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is" + commission);
        } else if (salesAmount < 10000) {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales commission is" + commission);
        }
        scan.close();
    }
}
