import java.util.Scanner;

public class leap_year {
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       long year; 
       System.out.println("Enter the year to check if it is leap year or not: ");
       year = input.nextLong();
      if (year % 4 ==0){
          if (year % 100 ==0 && year %400 ==0){
              System.out.printf("%d is a leap year.", year);
          }
          else{
              System.out.printf("%d is not a leap year.", year);
          }
      }
      else{
          System.out.printf("%d is not a leap year.", year);
      }
       input.close();
   }
}
