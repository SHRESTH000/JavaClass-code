import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter your string");
        str=sc.nextLine();
        int a=str.length();
        System.out.println("total lenght of string is:"+a);
        sc.close();
    }
    
}
