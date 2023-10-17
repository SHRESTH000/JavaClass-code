import java.lang.Math;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n,count=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=n;
        int b=n;
        while(n>0){
            count +=1;
            n=n/10;
        }
        while(a>0){
            int rem=a%10;
            sum+=(int)Math.pow(rem, count);
            a/=10;
        }
        if(sum == b){
            System.out.print("this is armstrong number:");
            System.out.println(sum);
        }
        else{
            System.out.println("this is not armstrong");
        }
        sc.close();


        

        
    }
}
