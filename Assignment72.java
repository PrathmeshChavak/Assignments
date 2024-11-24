package basicprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class As72 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
Map<Integer,String> m1=new HashMap<Integer,String>();

m1.put(1, "Manali");
m1.put(2, "Rohan");
m1.put(3, "Neha");

if(m1.containsKey(2)&& m1.containsValue("Rohan"))
                {


System.out.println("2=Rohan");

                }
        }
}