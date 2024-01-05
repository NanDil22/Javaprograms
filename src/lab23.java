package src;
import java.util.Scanner;
public class lab23 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1-7 I will tell you which day is today");
        int Day=sc.nextInt();
        switch(Day) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default: System.out.println("Please enter only values from 1 - 7");
            break;

        }
        sc.close();

        }
    }
//Checking the day today using "Switch" function