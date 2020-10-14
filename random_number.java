/*Program to generate random coin sides*/
import java.util.Random;

public class random_number {
    public static void main(String args[]){
        Random coin = new Random();
        int number;
        System.out.println("1 = Head");
        System.out.println("2 = Tail");
        for (int counter=1; counter<=10; counter++){
            number = 1 + coin.nextInt(2);
            System.out.println(number + "  ");
        }
    }
}
