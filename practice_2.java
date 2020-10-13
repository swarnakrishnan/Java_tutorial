import java.util.Scanner;

public class practice_2 {
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);
        int quantity;
        double discount, total;
        total = 0; discount = 0;
        System.out.println("Enter the quantity of items purchased: ");
        quantity = swarna.nextInt();
        if ((quantity*100)>1000){
            discount = (0.1)*quantity*100;
            System.out.println("Discount amount is "+ (discount));
            total = (quantity*100) - discount;
            System.out.println("Total amount you have to pay: "+ (total));
        }
        else {
            System.out.println("No discount!");
        }
    }
}
