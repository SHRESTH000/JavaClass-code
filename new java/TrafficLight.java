import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        int NoPeople=0;
        int op=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter how many people are there");
            NoPeople=sc.nextInt();
            sc.close();
           
            if(NoPeople<5){
                op=1;
            }
            else if(NoPeople>=5 && NoPeople<10){
                op=2;
            }
            else if (NoPeople>=10){
                op=3;
            }
            switch(op){
                case 1:{
                    System.out.println("it's red light wait for more people ");
                    break;
                }
                case 2:{
                    System.out.println("it's yellow light cross the lane slowly and see vechicle");
                    break;
                }
                case 3:{
                    System.out.println("it's green light cross the road ");
                    break;
                }

            }
        }
    }
}
