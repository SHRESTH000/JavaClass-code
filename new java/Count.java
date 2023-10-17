import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n;
        int count=0;

        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        n=sc.nextInt();
        while(n>0){
            count+=1;
            n=n/10;

        } 
        System.out.println("the total digit in this number is :"+count);
        sc.close();
     

        
    }
}
