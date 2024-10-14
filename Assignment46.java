/* WAP to check from the  given string find the letter end with y or not. 
Example: String name= "I live in Bangalore City";*/

public class Program
{
    public static void main(String[] args)
    {
        String input="I live in Bangalore City";
        boolean b1=input.matches("(.*)y");
        System.out.println(b1);
    }
}