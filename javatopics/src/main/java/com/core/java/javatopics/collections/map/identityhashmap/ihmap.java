//HashMap uses equals() method to check duplicacy
//linked hashmap uses == to check for duplicacy
import java.util.*;
public class ihmap{
public static void main(String args[]){
IdentityHashMap m=new IdentityHashMap();
Integer i1=new Integer(10);
Integer i2=new Integer(10);
m.put(i1,"pawan");
m.put(i2,"kalyan");
System.out.println(m);	
m.put(20,"rajji01");
m.put(20,"rajji02");
System.out.println(m);	
	//o/p-->{10,kalyan}
}
}