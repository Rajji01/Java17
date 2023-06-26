//every collection class implemets serilizable and cloneable interfaces'
//but only vector and arraylist implements RandomAccess interface
//random I is used  to acces any elment with same speed
//serilizable is used to transport collection obj from one place to another
//cloneable is used to create a copy so that we can change this copy and the original is the reserve 
//in case of any disaster to the copy we have original
//ARRAYLIST IS THE BEST CHOICE FOR FREQUENT RETRIVEVAL DATA
//ARRAYLIST IS THE WORST CHOICE FOR DELETION AND INSERTION IN MIDDLE EX CORORE SHIFTS
//LINKED LIST IS BEST FOR INSERTION AND DELETION
import java.io.*;
import java.util.*;
public class coll2{
public static void main(String args[]){
ArrayList l1=new ArrayList();
LinkedList l2=new LinkedList();
System.out.println(l1 instanceof Serializable);		//true
System.out.println(l2 instanceof Cloneable);		//true
System.out.println(l1 instanceof RandomAccess);		//true
System.out.println(l2 instanceof RandomAccess);		//false
}
}