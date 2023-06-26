// child class of hashset
//ds used is linkedlist+hashtable
//insertion order preserved
//linked hashset and linkedmap are usd for cache memory where duplicates are not allowed and insertion order 
//must be preserved
import java.util.*;
public class lhash {
public static void main(String args[]){
LinkedHashSet t=new LinkedHashSet();
t.add("a");
t.add("b");
t.add("c");
t.add("d");
t.add(null);
System.out.println(t.add("a"));	//duplicates not allowed
System.out.println(t);
System.out.println(t.add(null));//null can be inserted only once
t.add("e");
System.out.println(t);
}
}