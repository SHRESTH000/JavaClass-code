import java.util.Scanner;

public class Insurance_Company {

    static int Find_Premium(int age, String gender,int city){
        
        int premium=0;

        if(age>=25|| age <=35 && gender=="male"&& city==1){
            premium=6;
        }
        else if(age>=25|| age <=40 && gender=="male"&& city==2){
            premium=4;
        }
        else if(age>=25|| age <=42 && gender=="female"&& city==1){
            premium=3;
        }
        else if(age>=25|| age <=45 && gender=="female"&& city==2){
            premium=2;
        }
        else{
            System.out.println("not Insured");
            return -1;
        }



        return premium;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
            System.out.println("Enter person name ");
            String name =sc.nextLine();
            System.out.println("enter person gender");
            String gender=sc.nextLine();
            System.out.println("Enter person age ");
            int age=sc.nextInt();
            System.out.println("please choose city wheater");
            System.out.println("1-Metro city");
            System.out.println("2-Non Metro city");
            int city=sc.nextInt();
            sc.close();
            int premium= Find_Premium(age, gender, city);
            System.out.println("MR/Mss "+name+" your age "+age+" ,your gender "+gender+"and your preium is :"+premium+"%");
            if(city ==1){
                System.out.println("your city is metro");
            }
            else if(city ==2){
                System.out.println("your city is non metro");
            }
            else{
                System.out.println("your entered city is wrong");
            }
            
            

        
    }
}
