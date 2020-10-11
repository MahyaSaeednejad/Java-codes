import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static boolean anagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

        for(int i=0; i<s1.length(); i++)
        {
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),1)+1);
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i),1)+1);
        }
        if(hm1.equals(hm2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = scan.nextLine();
        System.out.println("Enter the second String");
        String s2 = scan.nextLine();

        if(anagram(s1,s2)== true)
            System.out.println("Two Strings are Anagram");
        else System.out.println("Two Strings are not Anagram");
    }
}
