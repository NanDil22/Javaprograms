package src;
import java.util.Scanner;
public class lab35 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which table is required");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }


    }
}

//Multiplication using user input