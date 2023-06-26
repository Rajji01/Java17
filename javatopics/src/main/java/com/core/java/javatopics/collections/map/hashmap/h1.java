
import java.io.*;
import java.util.*;
class h1  { 
public static void main(String args[]){
//return type of put is object

//when a duplicate key is inserted in map it returns the old value
//but it adds the new value to the key
//null insertion is allowe for both keys and values
HashMap m=new HashMap();
//m.put("100","rajji01");

System.out.println(m.put("100","rajji01"));
System.out.println(m);

//m.put("100","rajji02");
m.put(null,null);
System.out.println(m.put("100","rajji02"));
System.out.println(m.put(null,null));
System.out.println(m);
}
}
  