package src;
import java.util.Scanner;

public class lab24 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet,I will tell you if its an vowel or not");
        char input=sc.next().toCharArray()[0];
        switch(input){
            case 'a':
                System.out.println("Its an vowel");
                break;
            case'e':
                System.out.println("Its an vowel");
                break;
            case'i':
                System.out.println("Its an vowel");
                break;
            case'o':
                System.out.println("Its an vowel");
                break;
            case'u':
                System.out.println("Its an vowel");
                break;
            default:System.out.println("Its an consonant");
            break;


        }

//Vowel and Consonant program

    }
}
