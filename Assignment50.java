/*WAP to find the current  date and time, past date and time also the future date with time.*/

import java.util.Date;
public class TimeandDate
{
    public static void main(String[] args)
    {
        Date d1=new Date();
        long l1=d1.getTime(); //returns epoch time
        System.out.println(l1);// printing epoch time
        Date d2=new Date(d1.getTime());
        System.out.println(d2);
        String d3=d2.toString();
        String month=d3.substring(4,7);
        System.out.println(month);
        String year=d3.substring(d3.length()-4);
        System.out.println(year);
        String date=d3.substring(8,10);
        System.out.println(date);
        String dformat=date.concat("-").concat(month).concat("-").concat(year);
        System.out.println(dformat);
        Date d4=new Date(d1.getTime()+(1000*60*60*24*1));
        System.out.println("Future Date and Time is "+d4);
        Date d5=new Date(d1.getTime()-(1000*60*60*24*2));
        System.out.println("Past Date and Time is "+d5);
    }
}