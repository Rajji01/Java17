import java.util.*;


class emp implements Comparable{
int id;
String name;
emp(int id,String name){
this.name=name;
this.id=id;
}
public String toString(){
return id+"  "+name;}

public int CompareTo(Object o){
int i1=this.id;
int i2=((emp)o).id;
if(i1<i2)
return -1;
else 
return +1;
else 
return 0;
}

}


public class lit{
public static void main(String args[]){
/*LinkedList l1=new LinkedList();
l1.add("raj");
l1.add("rajji");
l1.add("rajat");
l1.add("agrawal");
System.out.println(l1);
ListIterator itr=l1.listIterator();

while(itr.hasNext()){
String s=(String)itr.next();
if(s.equals("raj"))
itr.remove();
else if(s.equals("rajji"))
itr.add("kabade");
else if(s.equals("rajat"))
itr.set("rajat will have gf after taking a job");
}
System.out.println(l1);*/

emp e1=new emp(1,"rajji");
emp e2=new emp(2,"aigrjpop");
emp e3=new emp(3,"hjhji");
emp e4=new emp(40,"efudihfs");
TreeSet t=new TreeSet();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
System.out.println(t);
TreeSet t2=new TreeSet(new mc());
t2.add(e1);
t2.add(e2);
t2.add(e3);
t2.add(e4);
System.out.println(t2);
}
}
class mc implements Comparator
{
public int compare(Object o1,Object o2){
String s1=((emp)o1).name;
String s2=((emp)o1).name;
return s1.compareTo(s2);

}

}