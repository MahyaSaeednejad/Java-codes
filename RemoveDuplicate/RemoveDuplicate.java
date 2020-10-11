import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        StringBuffer strBuff = new StringBuffer();

        Set<Character> lettersSet = new HashSet<Character>();

        for(int i=0; i<str.length(); i++)
        {
            char letter = str.charAt(i);
            if(lettersSet.contains(letter))
            {
                continue;
            }
            else{
                strBuff = strBuff.append(letter);
                lettersSet.add(letter);
            }
        }
        System.out.print("The string without duplicate is: "+ strBuff);
    }
}
