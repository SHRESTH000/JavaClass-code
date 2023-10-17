import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        //int account_no=1234;
        float salary=1000;
        int req=500;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("welcome to SAFE MONEY bank");
            System.out.println("choose the option what you want to do");
            System.out.println("1.Check balance");
            System.out.println("2.deposit money");
            System.out.println("3.Withdraw money");
            int option=sc.nextInt();
            sc.close();
            switch(option){
                case 1:{
                    System.out.println("your balance is :"+salary);
                    break;
                }
                case 2:{
                    System.out.println("Enter how many do you want to deposit");
                    float addup=sc.nextInt();
                    salary=salary+addup;
                    break;
                }
                case 3:{

                    if(salary>req){
                        System.out.println("enter the amount to be withdraw");
                        float didup=sc.nextInt();
                        salary=salary-didup;
                        break;
                        

                    }
                    else{
                        System.out.println("you have encificent balance");
                        break;
                    }
                }

            }

        }
        
       
    }
    
}
