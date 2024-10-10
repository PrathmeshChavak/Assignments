
import java.util.Scanner;
import java.util.Arrays;
public class Basics
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String input1=s1.next();
        System.out.println("Enter 2nd string");
        String input2=s1.next();
        if(input1.length()!=input2.length())
        {
            System.out.println("Entered strings are not anagram");
        }
        else
        {
            
            char c1[]=input1.toCharArray();
            char c2[]=input2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(Arrays.toString(c1));
            System.out.println(Arrays.toString(c2));
            boolean b1=Arrays.equals(c1,c2);
            if(b1==true)
            {
                System.out.println("Entered strings are anagram");
            }
            else
            {
                System.out.println("Entered strings are not anagram");
             }
        }
    }
}