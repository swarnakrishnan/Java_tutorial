import java.util.Scanner;

class operators{
    public static void main(String args[]){
        Scanner swarna = new Scanner(System.in);

        int a,b;
        a = 3; b =10;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(b--);
        System.out.println(--b);
        a *= b;
        System.out.println(a);
        swarna.close();
    }
}
