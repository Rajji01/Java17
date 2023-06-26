//hetrogenous obj
//increasing order of their lenght and if lenght is same than alphabetical
/*
trick for asc and desc
for asc(ob1,ob2)
if(ob1<ob2)
return+1
else if(ob2<ob1)
return -1;
for desc
if(ob1,ob2)
retrun -1;
else return +1;
*/
import java.util.*;
public class comp5{
public static void main(String args[]){
TreeSet t=new TreeSet(new mycomp5());
t.add("rajji");
t.add("kanha");
t.add(new StringBuffer("r"));
t.add(new StringBuffer("a"));
t.add(new StringBuffer("j"));
t.add("agrawal");
System.out.println(t);
}
}

class mycomp5 implements Comparator{
public int compare(Object ob1,Object ob2){
String s1=ob1.toString();		//when you dont know wheteher it is String or Strinbuffer
String s2=ob2.toString();
int i1=s1.length();
int i2=s2.length();	
if(i1<i2)
return -1;
else if(i1>i2)
return 1;
else	
return s1.compareTo(s2);

}
}