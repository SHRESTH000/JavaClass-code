import java.util.Scanner;

public class Area_Perimeter {


    static int Area(int lenght,int breath){
        
        int area=lenght*breath;
        
        return area;
    }

    static int Perimeter(int lenght,int breath){
        
        int perimeter=2*(lenght*breath);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the lenght and breath of rectriangle ");
        int lenght=sc.nextInt();
        int breath=sc.nextInt();
        int area =Area(lenght, breath);
        int perimeter=Perimeter(lenght, breath);
        System.out.println("your area is "+area+"and perimeter is "+perimeter);
        sc.close();


    }
}
