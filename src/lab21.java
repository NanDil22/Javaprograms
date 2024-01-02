package src;
import java.util.Scanner;

public class lab21 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A");
        } else if (score >= 80 && score <= 90) {
            System.out.println("Your grade is B");
        } else if (score >= 70 && score <= 80) {
            System.out.println("Your grade is C");
        } else if (score >= 60 && score <= 70) {
            System.out.println("Your grade is D");
        } else if (score >= 50 && score <= 60) {
            System.out.println("Your score is D");
        } else{
            System.out.println("Your have failed in exams");
        }
    }
    //Grade calculator
}
