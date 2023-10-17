import java.util.Scanner;

public class Fact {
    static int factorial(int nums){
        int a;
        if(nums==0){
            return 1;

        }else{
             a=nums*factorial(nums-1);
             
        }
        return a;
    }
    public static void main(String[] args) {
          int n,a=0;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter your number:");
        n=sc.nextInt();
        a=factorial(n);
         System.out.println("your factorial value is:"+a);
         sc.close();
    }
    
    
}
