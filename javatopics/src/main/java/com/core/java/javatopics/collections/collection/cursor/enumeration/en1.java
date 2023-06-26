import java.util.*;
public class en1{
public static void main(String args[]){

Vector v1=new Vector();
v1.add(1);
v1.add(2);
v1.add(3);
v1.add(4);
System.out.println(v1);
Enumeration e=v1.elements();

while(e.hasMoreElements()){
Integer I=(Integer)e.nextElement();

if(I%2==0)
System.out.println(I);
}
System.out.println(v1);
}
}