import java.io.*;
import java.util.*;
class t2  { 
public static void main(String args[]){
TreeMap m=new TreeMap(new mymc());
//m.put(null,"bzz"); null can not be inserted in any case

m.put("yyy",100);
m.put("xxx",200);
m.put("zzz",300);
m.put("aaa",400);
System.out.println(m);
}
}

class mymc implements Comparator{
public int compare(Object ob1,Object ob2){
String s1=ob1.toString();
String s2=ob2.toString();
return s2.compareTo(s1);

}
}
  