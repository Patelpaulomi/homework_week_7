import java.util.Scanner;

public class Program3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     */

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.marksheet();
    }
       // Scanner
    public void marksheet() {
        Scanner scan = new Scanner(System.in);
        int mathsMarks, scienceMarks, englishMarks, total;
        double percentage;
        String results;
        String grade = null;

         // Student Name, Roll Number and Three subjects marks

        System.out.println("Enter student name");
        String name = scan.nextLine();

        System.out.println("enter student roll number");
        int rollNum = scan.nextInt();

        System.out.println("Enter Maths Marks");
        mathsMarks = scan.nextInt();
        if (mathsMarks > 0 && mathsMarks <= 100) {
            System.out.println("valid input");
        } else {
            System.out.println("invalid input");
        }

        System.out.println("Enter Science Marks");
        scienceMarks = scan.nextInt();
        if (scienceMarks > 0 && scienceMarks <= 100) {
            System.out.println("valid input");
        } else {
            System.out.println("invalid input");
        }

        System.out.println("Enter English Marks");
        englishMarks = scan.nextInt();
        if (englishMarks > 0 && englishMarks <= 100) {
            System.out.println("valid input");
        } else {
            System.out.println("invalid input");

        }
        double sum = (scienceMarks + englishMarks + mathsMarks);
        System.out.println(sum);
        percentage = sum / 300 * 100;
        System.out.println(percentage);

         // Pass OR Fail

        if (percentage >= 35) {
            results = "pass";
        } else {
            results = "fail";
        }
        System.out.println(results);

        // Grade

        if (percentage >= 80) {
            grade = "A+";
            System.out.println(grade);
        } else if (percentage >= 60 && percentage <= 79) {
            grade = "A";
            System.out.println(grade);
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "B";
            System.out.println(grade);
        } else if (percentage >= 35 && percentage <= 49) {
            grade = "C";
            System.out.println(grade);
        }

        // Marksheet Print

        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("|       Mark Sheet             |");
        System.out.println("|------------------------------|");
        System.out.println("| Name :" + name + "                    |");
        System.out.println("| Roll No :" + rollNum + "                   |");
        System.out.println("|------------------------------|");
        System.out.println("| Subjects   :   Marks         |");
        System.out.println("|------------------------------|");
        System.out.println("| Maths :" + mathsMarks +"                    |");
        System.out.println("| Science :" + scienceMarks +"                  |");
        System.out.println("| English :" + englishMarks +"                  |");
        System.out.println("|------------------------------|");
        System.out.println("| Total :" + sum +"                 |");
        System.out.println("|------------------------------|");
        System.out.println("| Percentage :" + percentage +"             |");
        System.out.println("| Result :" + results + "                 |");
        System.out.println("| Grade" + grade + "                      |");
        System.out.println("|------------------------------|");

       scan.close();
    }


}
