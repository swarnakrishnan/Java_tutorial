import java.util.Scanner;

public class practice_6 {
   public static void main(String args[]){
       Scanner swarna = new Scanner(System.in);
       char ch;
       System.out.println("Enter the character: ");
       ch= swarna.next().charAt(0);
       if (ch>='A' && ch<='Z'){
           System.out.println("Letter is uppercase");
       }
       else if(ch>='a' && ch<='z'){
           System.out.println("Letter is lowercase");
       }
       else{
           System.out.println("It is not alphabetic character");
       }
   }
}
