/*Write a program on reverse a string.*/

import java.util.Scanner;
public class RevString
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=s1.next();
        System.out.println("Entered String is "+input);
        String output="";
        for(int i=input.length()-1;i>=0;i--)
        {
            char c1=input.charAt(i);
            output=output+c1;
        }
        System.out.println("Reversed String is "+output);
    }
}