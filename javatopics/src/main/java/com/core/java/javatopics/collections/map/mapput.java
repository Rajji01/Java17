//map are used to represent a group of objects as a key value pair
//key can not be same but values cn be
//eturn type of put method is old value when key already exists
//if not than null
import java.util.*;
public class mapput{
public static void main(String args[]){
HashMap m=new HashMap();
m.put("100","vijay");
System.out.println(m);
m.put("101","rajat");
m.put("102","rajji");
System.out.println(m);
m.put("102","lala");
System.out.println(m);
}
}