import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      // String ch="no";
       Scanner sc=new Scanner(System.in);
       // while(ch!= "no"||ch!="NO"||ch!="No"){        
          System.out.println("enter your number");
          int a=sc.nextInt();
          System.out.println("enter you secod number");
          int b=sc.nextInt();
          System.out.println("enter your operetor");
          char op=sc.next().charAt(0);
          if(op=='+'||op=='-'||op=='*'){
              switch(op){

                   case '+':{
                       System.out.println(a+b);
                       break;
                    }
                  case'*':{
                      System.out.println(a*b);
                      break;
                    }
                    case'-':{
                        System.out.println(a-b);
                      break;

                    }
                }
                        

            }
            else{
               System.out.println("your enter operator is wrong");
            }
          // System.out.println("do you want to use calculator again");
            //ch=sc.nextLine();
       
       // }
       sc.close();
    }
}
