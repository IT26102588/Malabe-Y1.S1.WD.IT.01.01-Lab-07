import java.util.Scanner;

public class  IT26102588Lab7Q1A {
    public static void main(String[] args) {

        
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter marks for four subjects :");

        System.out.println("Enter Subject mark 01 :");
        mark1 = input.nextInt();

        System.out.println("Enter Subject mark 02 :");
        mark2 = input.nextInt();

        System.out.println("Enter Subject mark 03 :");
        mark3 = input.nextInt();

        System.out.println("Enter Subject mark 04 :");
        mark4 = input.nextInt();

        
        avg = (mark1 + mark2 + mark3 + mark4) / 4.0;

        
        if (avg >= 75) {
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is :" + avg);
        System.out.println("Overall Grade is :" + grade);
    }
}