/*Write a program where you get an array index out of bound exception.*/
public class ArrayIOBE
{
    public static void main(String[] args)
    {
        int rollno[]={1,2,3};
        System.out.println("The element at index is: " + rollno[3]);
    }
}