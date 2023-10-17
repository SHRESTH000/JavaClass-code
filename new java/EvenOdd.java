import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you starting and ending range");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println("this is even number:"+i);

            }
            else{
                System.out.println("this is odd number:"+i);
            }
        }sc.close();

        
    }
}
