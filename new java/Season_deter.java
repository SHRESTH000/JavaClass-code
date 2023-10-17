import java.util.Scanner;

public class Season_deter {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter you month in small letter");
            String month=sc.nextLine();
            int op=0;
            sc.close();
            if(month.equals("december")||month.equals("january")|| month.equals("february")){
                op=1;

            }
            else if(month.equals("march")||month.equals("april")|| month.equals("may")){
                op=2;
            }  
            else if(month.equals("june")|| month.equals("july")||  month.equals("august")){
                op=3;
            }
            else if(month.equals("september") || month.equals("october") || month.equals("november")){
                op=4;
            }
            else{
                System.out.println("your enterned month name is wrong");
            }      
                          
            switch(op){
                case 1:{
                    System.out.println("it's a winter ,enjoy your winter");
                    break;

                }
                case 2:{
                    System.out.println("it's spring , enjoy your spring");
                    break;
                }
                case 3:{
                    System.out.println("it's summer, enjoy your summer");
                    break;
                }
                case 4:{
                    System.out.println("it's autumn , enjoy your autumn");
                    break;
                }

            }
        }
    }
    
}
