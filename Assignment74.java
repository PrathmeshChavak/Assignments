package basicprogram;
class Amazon{
        
        
        private String emailid="xyz@gmail.com";

        public String getEmailid()
        {
                return emailid;
        }
        public void setEmailid(String emailid)
        {
                this.emailid=emailid;
        }
        
        
}
public class AS74_Encapsulation extends Amazon{

        public static void main(String[] args) {
           
                AS74_Encapsulation as=new AS74_Encapsulation();
                as.setEmailid("pratham@abc.com");
                System.out.println(as.getEmailid());
        }

        
}