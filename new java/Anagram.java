import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,str1;
        int count=0;
        System.out.println("enter your two string");
        str=sc.nextLine();
        str1=sc.nextLine();
        sc.close();
        if(str.length()==str1.length()){
            for(int i=0;i<str.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str.charAt(i)==str1.charAt(j)){
                        count+=1;
                        break;
                    }
                }               
             
            }
        }
        else {
            System.out.println("your enter string is not anagram");
        }
        if(str.length()==count){
            System.out.println("string is anagram:");
        }
        else{
            System.out.println("string is not anagram");
        }
    }
}
