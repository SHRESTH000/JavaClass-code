import java.util.Scanner;

public class Fibbo {
    static long fib(int n){
        

        if(n<=1){
            return n;
        }
        



        
        return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        n=sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
}
