import java.util.*;
public class treeset1{
public static void main(String args[]){
TreeSet t=new TreeSet();
//t.add(null);
t.add("a");
t.add("A");
t.add("b");
t.add("c");
t.add("d");
//t.add(10); hetrogenous error
//t.add(null); null pointer exeption
System.out.println(t);
}
}