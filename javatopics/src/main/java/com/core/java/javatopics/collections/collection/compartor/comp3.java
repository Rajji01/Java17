//string entered into treeset and than sorted through customization
//using comparator object and than using compare to give in descending using - sign
import java.util.*;
public class comp3{
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
return -s1.compareTo(s2);

}
}