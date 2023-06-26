//ArrayList
//insetion preserved
//duplicates allowed
//null allowed
//implemetation class of list interface
//best for retrieval
//worst for insertion and deletion in middle
//data structure used dynamic arrays
import java.util.*;
public class coll1{
public static void main(String args[]){
ArrayList l=new ArrayList(50);
l.add(1);
l.add("all");
l.add(1.3f);
l.add(null);
l.add(1.3f);
System.out.println(l);
l.add(2,"m");
l.add("n");
System.out.println(l);
l.remove(2);
System.out.println(l);
}
}
