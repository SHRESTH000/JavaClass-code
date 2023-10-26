import java.util.Scanner;

public class Simple_interest {


    static int CSimple_interest( int principal_amount,int time ,int interest_rate){
        
        int Simple_interest=(principal_amount*time*interest_rate)/100;
        
        
        
        return Simple_interest;        
    }
    static int Amount(int principal_amount , int simple_interest){
               
        int amount=principal_amount+simple_interest;
        
        return amount;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your principal amount ");
        int principal_amount=sc.nextInt();
        System.out.println("Enter your time period");
        int time =sc.nextInt();
        System.out.println("enter your interrest rate");
        int interest_rate=sc.nextInt();
        int simple_interest=CSimple_interest(principal_amount, time, interest_rate);
        int amount=Amount(principal_amount, simple_interest);
        System.out.println("your total amount that you need to return is "+amount);
        sc.close();


    }
}
