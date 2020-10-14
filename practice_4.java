import java.util.Scanner;

public class practice_4 {
   public static void main(String args[]){
       Scanner swarna = new Scanner(System.in);
       int marks;
       System.out.println("Enter your marks: ");
       marks = swarna.nextInt();
       if (marks<25){
           System.out.println("You have secured F grade.");
       }
       else if (marks >25 && marks <=45){
           System.out.println("You have secured E grade");
       }
       else if (marks >45 && marks<= 50){
           System.out.println("You have secured D grade");
       }
       else if ( marks >50 && marks <=60){
           System.out.println("You have secured C grade.");
       }
       else if (marks >60 && marks <=80){
           System.out.println("You have secured B grade.");
       }
       else {
           System.out.println("You have secured A grade");
       }
      swarna.close();
   }
}
