
import java.util.Arrays;
import java.util.Scanner;
public class Charcount
{
    static int alphacount;
    static int numcount;
    static int spacecount;
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=s1.nextLine();
        char c1[]=input.toCharArray();
        System.out.println(Arrays.toString(c1));
        for(int i=0;i<input.length();i++)
        {
            boolean b1=Character.isAlphabetic(c1[i]);
            if(b1==true)
            {
                alphacount++;
            }
            boolean b2=Character.isDigit(c1[i]);
            if(b2==true)
            {
                numcount++;
            }
            boolean b3=Character.isWhitespace(c1[i]);
            if(b3==true)
            {
                spacecount++;
            }
        }
        int spclcount=input.length()-(alphacount+numcount+spacecount);
        System.out.println("Number of alphabets in the entered string is=> "+alphacount);
        System.out.println("Number of digits in the entered string is=> "+numcount);
        System.out.println("Number of spaces in the entered string is=> "+spacecount);
        System.out.println("Number of special characters in the entered string is=> "+spclcount);
    }
}