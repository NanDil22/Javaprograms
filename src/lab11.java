package src;

public class lab11 {
    public static void main(String[] Args){
        int a=10;
        int b=20;
        int c=30;
        int max=(a>b)?((a<c)?a:c):((b>c)?b:c);
        System.out.println("Maximum of three numbers are " + max);
        // Ternary application for 3 numbers
    }
}
