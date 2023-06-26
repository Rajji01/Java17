//in case of arrays no type casting is req
//in case of collections type casting is req
//because we dont know what type of object it might have
public class gn3{
public static void main(String args[]){
ArrayList l=new ArrayList();
l.add("rajji");
l.add("agrawal");
l.add(new Integer(10));
String s1=l.get(0);// ct error we dont know what type is it
}