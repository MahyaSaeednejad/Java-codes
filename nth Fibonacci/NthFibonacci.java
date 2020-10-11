import java.util.Scanner;

public class NthFibonacci {
    static int nthFibonacci(int n)
    {
        int a=1;
        int b=1;
        int c=0;
        for(int i=0; i<n-2; i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();

        System.out.println("The "+n+"th Fibonacci number is: "+ nthFibonacci(n));
    }
}
