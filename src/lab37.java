package src;
import java.util.Scanner;
public class lab37 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num =sc.nextInt();
        long fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact+i;
            fact++;
        }
System.out.println("Factorial" + fact);
    }
}
