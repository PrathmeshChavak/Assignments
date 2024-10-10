import java.util.Arrays;
import java.util.Scanner;
public class BasicArrays
{
    public static void main(String[] args)
    {
        int rollno[]=new int[5];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter values of array");
        for(int i=0;i<5;i++)
        {
            rollno[i]=s1.nextInt();
        }
        System.out.println("values of array are "+Arrays.toString(rollno));
        int numtocheck=50;
        boolean b1=false;
        for(int i=0;i<rollno.length;i++)
        {
            if(rollno[i]==numtocheck)
            {
                b1=true;
                break;
            }
        }
          if(b1==true)
          {
              System.out.println(numtocheck+" is present in the array");
          }
          else
          {
              System.out.println(numtocheck+" is not present in the array");
          }
    }
}