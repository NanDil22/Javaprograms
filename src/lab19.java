package src;

import java.util.Scanner;

public class lab19 {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();

        if (a < b) {
            System.out.println("Smaller number is  " + a);

        } else {
            System.out.println("Greater number is " + b);
        }
        sc.close();
    }
    //If else program with user inputs
}