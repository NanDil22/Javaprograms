package src;
import java.util.Scanner;

public class lab22 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3= sc.nextInt();
        if((side1==side2) && (side2==side3) &&(side1==side3))
        {
            System.out.println("Its an Equilateral triangle");
        }
        else if((side1==side2) || (side1==side3) || (side2==side3))
        {
            System.out.println("Its an Isoceles triangle");
        }
        else{
            System.out.println("Its an Scalene triangle");
        }

// Triangle classifier program
    }
}
