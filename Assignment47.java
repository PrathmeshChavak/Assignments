/* WAP to check from the  given string find the letter "s" is present or not. 
Example: String input= "I love switzerland"; */

public class Program
{
    public static void main(String[] args)
    {
        String input= "I love switzerland"; 
        boolean b1=input.matches("(.*)s(.*)");
        System.out.println(b1);
    }
}