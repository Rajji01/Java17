import java.util.*;

public class hmap{
public static void main(String []args){

HashMap m=new HashMap();
m.put("rajji",700);
m.put("rajat",1000);
m.put("kanha",200);
m.put("lala",500);
System.out.println(m);			//o/p unexpected because stored by hashcode
System.out.println(m.put("lala",650));

Set s=m.keySet();
System.out.println(s);
Collection c=m.values();
System.out.println(c);
Set s1=m.entrySet();		//entryset objects
System.out.println(s1);

Iterator itr=s1.iterator();	//to access a group of entry obj-->cursors
while(itr.hasNext()){
Map.Entry m1=(Map.Entry)itr.next();
System.out.println(m1.getKey()+"---"+m1.getValue());
if(m1.getKey().equals("lala")){
m1.setValue(10000);
}

}
System.out.println(m);
}
}