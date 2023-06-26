import java.util.*;
class Employee implements Comparable{
String name;
int eid;
Employee(String name ,int eid){
this.name=name;
this.eid=eid;
}
public String toString(){return name+"--"+eid;}
public int compareTo(Object obj ){
int eid=this.eid;
Employee e=(Employee)obj;
int eid2=e.eid;
if(eid<eid2){return-1;}
else if(eid>eid2){return 1;}
else return 0;
}
}
class mycomp6{
public static void main(String args[]){
Employee e1=new Employee("rajii",100);
Employee e2=new Employee("rajat",200);
Employee e3=new Employee("agrawal",50);
Employee e4=new Employee("rocky",150);
Employee e5=new Employee("kanha",100);
TreeSet t=new TreeSet();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
t.add(e5);
System.out.println(t);
TreeSet t1=new TreeSet(new Myc());
t1.add(e1);
t1.add(e2);
t1.add(e3);
t1.add(e4);
t1.add(e5);
System.out.println(t1);
}}
class Myc implements Comparator
{
public int compare(Object ob1,Object ob2)
{
Employee e1=(Employee)ob1;
Employee e2=(Employee)ob2;
String s1=e1.name;
String s2=e2.name;
return s1.compareTo(s2);
}
} 