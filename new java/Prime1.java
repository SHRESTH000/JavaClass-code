import java.util.Scanner;

public class Prime1 {
    
  public static int isprime(int n) {
    // for loop from 2 to n
    for (int i = 2; i < n; i++) {
      // if the number is divisible return -1
      if (n % i == 0) {
        return -1;
      }
    }

    // return 1 if number is prime
    return 1;
  }

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter your range:");
    a=sc.nextInt();
    b=sc.nextInt();
    sc.close();

    for (int i = a; i <= b; i++) {
      // if the number is prime print the number
      if (isprime(i) == 1) {
        System.out.print(i + " ");
      }
    }
  }
}
