//through genrics we provide  type safety to collections
import java.util.*;
public class gn4{
public static void main(String args[]){
ArrayList<String> l=new ArrayList<String>();
l.add("rajji");
l.add("agrawal");
//l.add(new Integer(10));//error
String name=l.get(0);
System.out.println(name);//no type casting req
}}