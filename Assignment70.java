package basicprogram;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class As70 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
Map<Integer,String> m1=new HashMap<Integer,String>();
m1.put(1, "Pratham");
m1.put(2,"Deepali");
m1.put(3, "Shivani");
for (java.util.Map.Entry<Integer, String> i2:m1.entrySet())
{
System.out.println(i2);        
}
        }

}