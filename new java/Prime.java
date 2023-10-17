import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i,m=0,c=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        n=sc.nextInt();
        sc.close();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+"is not a prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(n%1==0){
                    System.out.println(n+"is not a prime number");
                    c=1;
                }break;
            }
        }
        if(c==0){
            System.out.println(n+" is a prime number");
        }
        
    }
}
