//in case of string buffer it is compulsory to use comparator
//because stringbuffer dows not implements the comparable interface thats why it cannot use the default compareto()
import java.util.*;
public class comp4{
public static void main(String args[]){
TreeSet t=new TreeSet(new mycomp1());
t.add(new StringBuffer("r"));
t.add(new StringBuffer("a"));
t.add(new StringBuffer("j"));
t.add(new StringBuffer("t"));
System.out.println(t);
}
}

class mycomp1 implements Comparator{
public int compare(Object ob1,Object ob2){
String s1=ob1.toString();		//when you dont know wheteher it is String or Strinbuffer
String s2=ob2.toString();		
return -s1.compareTo(s2);

}
}