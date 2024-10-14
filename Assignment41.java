/*WAP from the given string input replace all the alphabets with Nothing.
Example: String name= "kv no 2";*/
public class Program1
{
    public static void main(String[] args)
    {
        String input="kv no 2";
        String s1=input.replaceAll("[a-z]"," ");
        System.out.println(s1);
    }
}