import java.util.Scanner;

class program{
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);
        int n;
        System.out.println(" Choose one freom the following: 1,2,3,4,5,6,7");
        System.out.println("Enter the number: ");
        n= swarna.nextInt();
        switch (n){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednessday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6: 
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
        swarna.close();
    }
}
