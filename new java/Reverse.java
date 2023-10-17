import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
         int a;;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value of a:");
        a=sc.nextInt();
        System.out.println("Enter your value of b:");
        b=sc.nextInt();  
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(" your reverse of a:"+a);
        System.out.println("your reverse value of b:"+b);
        sc.close();
    }
}
