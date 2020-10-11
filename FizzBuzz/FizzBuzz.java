import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    static List<String> fizzBuzz(int n)
    {
        LinkedList<String> list = new LinkedList<String>();

        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                list.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                list.add("Fizz");
            }
            else if(i%5 ==0)
            {
                list.add("Buzz");
            }
            else{
                 list.add(Integer.toString(i));
                }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();

        List<String> list = fizzBuzz(n);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
