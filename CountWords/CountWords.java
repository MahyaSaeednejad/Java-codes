import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();

        String words[] = str.split(" ");

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i=0; i<words.length; i++)
        {
            hm.put(words[i], hm.getOrDefault(words[i],0)+1);
        }

        System.out.println(hm);
    }
}
