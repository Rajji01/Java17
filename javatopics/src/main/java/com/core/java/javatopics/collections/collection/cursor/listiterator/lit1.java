//Enum,listiteratot,iterator
//these are all interface 
//but we are creating obj of interfaces
//no it looks like we are creating interfaces obj 
//but in reality we are creating object of the implementing classes of these interfaces
//and these clases are anonymous classes



import java.util.*;
public class lit1{
public static void main(String args[]){

Vector v=new Vector();
Enumeration e=v.elements();
Iterator i=v.iterator();
ListIterator l=v.listIterator();
System.out.println(e.getClass().getName());
System.out.println(i.getClass().getName());
System.out.println(l.getClass().getName());
}
}