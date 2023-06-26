//string entered into tree set and customized sorting through comparator obj
//in  ascending order by calling through compare method than using compareto
//compareto returns efault and - is used than it returns the opposite
import java.util.*;
public class comp2{

public static void main(String args[]){
TreeSet t=new TreeSet(new mycomp1());
t.add("rajji");
t.add("kanha");
t.add("lala");
t.add("kannu");
System.out.println(t);
}
}

class mycomp1 implements Comparator{
public int compare(Object ob1,Object ob2){
String s1=ob1.toString();		//when you dont know wheteher it is String or Strinbuffer
String s2=(String)ob2;			//when you know for sure that it is string
return s2.compareTo(s1);

}
}