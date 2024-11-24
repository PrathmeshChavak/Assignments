public class As58_switch 
{

        public static void main(String[] args) 
        {
                int input=1;
            int a=5;
            int b=10;
            switch(input)
            {
                case 1:int sum=a+b;
                System.out.println(sum);
                break;
                case 2:int dif=b-a;
                System.out.println(dif);
                break;
                case 3:int mul=a*b;
                System.out.println(mul);
                break;
                case 4:int div=b/a;
                System.out.println(div);
                break;
                default:
                System.out.println("no arithmetic operation");
            }

        }

}