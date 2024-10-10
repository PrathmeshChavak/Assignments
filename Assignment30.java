/* Write a array program to update the array value.*/

import java.util.Arrays;
public class ArrayBasics
{
    public static void main(String[] args)
    {
        int num1[]= {1,2,3,4,5};
        System.out.println("Before Edit "+Arrays.toString(num1));
        num1[2]=9;
        num1[4]=0;
         System.out.println("After Edit "+Arrays.toString(num1));
    }
}