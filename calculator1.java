import java.util.Scanner;

public class calculator1{
   public static void main(String args[]){
       Scanner swarna = new Scanner(System.in);
       int a,b,c;
       System.out.println("Enter the first number: ");
       a = swarna.nextInt();
       System.out.println("Enter the second number: ");
       b = swarna.nextInt();
       System.out.println("Enter the desired operator number 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Quotient");
       c = swarna.nextInt();
       switch (c){
           case 1: 
           System.out.println(a+b);
           break;
           case 2:
           System.out.println(a - b);
           break;
           case 3: 
           System.out.println(a * b);
           break;
           case 4: 
           System.out.println(a / b);
           break;
           case 5:
           System.out.println(a % b);
           break;
           default:
           System.out.println("Invalid choice");
           break;
       }
   }
}
