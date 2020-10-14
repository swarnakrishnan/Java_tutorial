import java.util.Scanner;

class calculator {
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);
        double fnum, snum, answer, diff, mul;
        System.out.println("Enter first number: ");
        fnum = swarna.nextDouble();
        System.out.println("Enter Second number: ");
        snum = swarna.nextDouble();
        answer = fnum + snum ;
        System.out.println(answer);
        diff = fnum - snum;
        System.out.println(diff);
        mul = fnum* snum;
        System.out.println(mul);
        swarna.close();
       }   
}
