import java.util.Arrays;
import java.util.Scanner;
public class ArrayBasics
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter values of the array");
        int num1[]= new int[5];
        for(int i=0;i<5;i++)
        {
            num1[i]=s1.nextInt();
        }
        System.out.println(Arrays.toString(num1));
    }
}