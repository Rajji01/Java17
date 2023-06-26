import java.util.*;
public class linked{
public static void main(String args[]){
LinkedList l=new LinkedList();
l.add("a");
l.add("null");
l.add(1);
System.out.println(l);
l.set(0,"b");			// it is used to replace
System.out.println(l);
l.addFirst("ccc");
System.out.println(l);
l.removeLast();
System.out.println(l);
}
}