import java.util.Scanner;

public class compound {
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       double principle, total, rate;
       int n=1;
       System.out.print("Enter the principal amount: ");
       principle = input.nextDouble();
       System.out.println("Enter the rate of interest: ");
       rate = input.nextDouble();
       do{
           total = principle * Math.pow(1+rate, n);
           n++;
           System.out.println(n +"  "+ total);
       }
       while(n<=20);
   }
}
