import java.util.Scanner;

public class practice_3 {
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);
        int salary, service;
        System.out.println("What is your current salary: ");
        salary = swarna.nextInt();
        System.out.println("How many years have you completed in this company: ");
        service = swarna.nextInt();

        if (service > 5){
            System.out.println("You are getting a bonus of "+ (0.05*salary) + "."+ "Your total salary including bonus is " + ((0.05*salary)+salary) + ".");
        }
        else{
            System.out.println("You are not eligible for bonus!");
        }
        swarna.close();
    }
}
