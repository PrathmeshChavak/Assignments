/* WAP from the given string replace the space with underscore.
Example: String input= "My name is Prathamesh Chavak";*/

public class Program1
{
    public static void main(String[] args)
    {
        String input="My name is Prathamesh Chavak";
        String s1=input.replaceAll(" ","_");
        System.out.println(s1);
    }
}