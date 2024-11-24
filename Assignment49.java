/*WAP where the your name is like "RAM" and print the output like:
R
A
M
And Print the second output as like:
M
A
R */
import java.util.Arrays;
public class Program
{
    public static void main(String[] args)
    {
        String input="RAM";
        for(int i=0;i<3;i++)
        {
            System.out.println(input.charAt(i));
        }
        System.out.println("--------");
        for(int j=2;j>=0;j--)
        {
            System.out.println(input.charAt(j));
        }
    }
}