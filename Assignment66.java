package basicprogram;

import java.util.ArrayList;
import java.util.List;

public class As66_upcasting {

        public static void main(String[] args)
 {
               
ArrayList a1=new ArrayList();
List li=new ArrayList();//upcasting
li.add(45);
li.add("Proto");
li.add(null);
li.add("Proto");
List l1=new ArrayList();
l1.addAll(li);
System.out.println(l1);
        }

}