/*WAP from the given string input replace all the entire numerics with Nothing.
Example: String name= "My home is near to sector 2 Patna 4";*/

public class Program1
{
    public static void main(String[] args)
    {
        String input="My home is near to sector 2 Patna 4";
        String s1=input.replaceAll("[0-9]", " ");
        System.out.println(s1);
    }
}