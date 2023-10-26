import java.util.Scanner;

public class Salary {

    static int HRA(int salary){
        int hra=(int) (salary *0.3);       
             
      
        return hra;      
    }
    static int DA(int salary){
        int da=(int) (salary *0.2);
        
               
        return da;      
    }
    static int TA(int salary){
        int ta=2000;       
        
               
        return ta;      
    }
    static int GROSS_SALARY(int basic,int hra,int da,int ta){
        int gross=basic+hra+da+ta;       
        
               
        return gross;      
    }
    static int TAX(int salary){
        int a=(int) (salary *0.1);
        

        
        
        
        
        return a;      
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter employee name");
        String str =sc.nextLine();
        System.out.println("enter his salary");
        int s=sc.nextInt();
        int hra=HRA(s);
        int da=DA(s);
        int ta=TA(s);
        int gross=GROSS_SALARY(s, hra, da, ta);
        int tax=TA(s);
        int net=gross-tax;
        System.out.println("EMPOLYEE NAME : "+str);
        System.out.println("BASIC SALARY: "+s);
        System.out.println("GROSS SALARY: "+gross);
        System.out.println("NET SALARY: "+net);
        sc.close();




        

    }
}
