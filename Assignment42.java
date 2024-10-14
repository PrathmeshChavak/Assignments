/*WAP from the given string input replace all the Capital letters with Nothing.
Example: String name= "I am The Greatest Ever"; */

public class Program1
{
    public static void main(String[] args)
    {
        String input="I am The Greatest Ever";
        String s1=input.replaceAll("[A-Z]", " ");
        System.out.println(s1);
    }
}