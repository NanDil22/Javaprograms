package src;
import java.util.Scanner;
public class lab25 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Enter the value to check if it is even number");

        for (i = 0; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println(i + "Its an Even Number");
        }
        System.out.println(i + "Its an Odd Number");
    }
    //Even and odd numbers

}