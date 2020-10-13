import java.util.Scanner;

public class ifcondiation {
    public static void main(String args[]){
       Scanner swarna = new Scanner(System.in);
       int length, breadth;
       System.out.println("Enter the value of length: ");
       length = swarna.nextInt();
       System.out.println("Enter the value of breadth: ");
       breadth = swarna.nextInt();
       if (length == breadth){
           System.out.println("It is a square.");
       }
       else{
           System.out.println("It is not a square");
       }
    }
}
