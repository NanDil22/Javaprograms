package src;

import java.util.Scanner;

public class lab26 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values from 1 to 7 ");
        int itemcode= sc.nextInt();
     switch(itemcode){
         case 1:
         System.out.println("Its an A");
         break;
         case 2:
             System.out.println("Its an B");
             break;
         case 3:
             System.out.println("Its an C");
             break;
         case 4:
             System.out.println("Its an D");
             break;
         case 5:
             System.out.println("Its an E");
             break;
         case 6:
             System.out.println("Its an F");
             break;
         case 7:
             System.out.println("Its an G");
             break;
         default:
             System.out.println("Please enter from 1-7 only");
     }
     //Use of Switch function

    }
}
