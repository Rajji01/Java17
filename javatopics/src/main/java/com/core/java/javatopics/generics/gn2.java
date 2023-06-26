//generics are used to porvide type safety and solve type  casting problem
//array s are type safe 
//can take only one type of values
//but collections are not type safe
// for example array list can take strings plus integer
//and retrib-ving this value can result in abnormal ter=mination
import java.util.*;
public class gn2{
public static void main(String args[]){
ArrayList l=new ArrayList();
l.add("rajji");
l.add("agrawal");
l.add(new Integer(10));
String s1=(String)l.get(0);
String s2=(String)l.get(1);
System.out.println("succesful");
//String s3=(String)l.get(2);
}
}