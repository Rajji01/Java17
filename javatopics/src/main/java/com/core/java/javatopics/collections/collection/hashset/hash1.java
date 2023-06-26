//insertion and duplication not alowed
//but does not give any error returns false
//ds is hashtable
//.75 load factor/fill ratio
//null is possible but only once
//implement serializable,cloneablebut not randomaccess
//used for search
import java.util.*;
public class hash1 {
public static void main(String args[]){
HashSet t=new HashSet();
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