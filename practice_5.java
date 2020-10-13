import java.util.Scanner;

public class practice_5 {
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x: ");
        x = swarna.nextInt();
        if (x<0){
            System.out.println("Absolute value of x is "+ (-1*x));
        }
        else{
            System.out.println("Absolute value of x is "+ x);
        }
    }
}
