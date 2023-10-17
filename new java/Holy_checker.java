import java.util.Scanner;

public class Holy_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose the option to determin");
        System.out.println("1.MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY");
        System.out.println("2.SATURDAY,SUNDAY");
        int option=sc.nextInt();
        switch(option){
            case 1:{
                System.out.println("oops dear it is weekday ");
                break;
            }
            case 2:{
                System.out.println("congraluation it is weekend day ENJOY");
                break;
            }

        }sc.close();
    }
    
}
