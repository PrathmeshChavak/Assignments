import java.util.Arrays;
public class ArrayBasics
{
    public static void main(String[] args)
    {
        int num1[]= {1,2,3,4,5};
        int num2[]={1,2,3,4,5};
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        boolean b1=Arrays.equals(num1,num2);
        if(b1==true)
        {
            System.out.println("Both arrays are equal");
        }
        else
        {
            System.out.println("Both arrays are not equal");
        }
    }
}