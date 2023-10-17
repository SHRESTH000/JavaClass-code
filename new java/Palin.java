import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        int a,b=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your palindrom number:");
        a=sc.nextInt();
        System.out.println(a);
        int z=a;
        while(a>0){
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
        if(z==c)
        {
            System.out.print("this is palendrom number:");
            System.out.println(c);
        }
        else{
            System.out.print("this is not palendrom numeber:");
            System.out.print(c);

        }
        sc.close();
    }
}
