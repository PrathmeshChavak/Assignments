/*Write a program to check whether the entered string is palindrome or not.*/

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
        boolean b1=input.equals(output);
        if(b1==true)
        {
            System.out.println("Entered String is a palindrome");
        }
        else
        {
            System.out.println("Entered String is not a palindrome");
        }
    }
}