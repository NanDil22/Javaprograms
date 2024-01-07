package src;
import java.util.Scanner;
public class lab36 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even number " + i);
            }
            else{
                System.out.println("Odd number "+ i);
            }
        }

    }
}
//Print odd and even numbers together