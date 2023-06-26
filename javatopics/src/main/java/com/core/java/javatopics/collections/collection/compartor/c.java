//https://www.geeksforgeeks.org/lock-framework-vs-thread-synchronization-in-java/?ref=feed
//only child should not come after parent and other tahn this anything is possible
//09-04-2019
import java.util.*;
import java.io.*;

class Employee implements Comparable
{

	int id;
	String name;

	Employee(int id,String name)
	{
	this.id=id;
	this.name=name;
	}


public int compareTo(Object o1)
	{
		if(id<(((Employee)o1).id))	
			return -1;
		else if(id>(((Employee)o1).id))
			return +1;
		else
			return 0;
	}

public String toString(){return id+" "+name;}
}


class c{
static BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
public static void main(String args[]){
	Employee e1=new Employee(1,"raman");
	Employee e2=new Employee(2,"rajji");
	Employee e3=new Employee(3,"kohli");
	Employee e4=new Employee(4,"ab");
TreeSet t=new TreeSet();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);

System.out.println(t);

TreeSet t1=new TreeSet(new myC());
t1.add(e1);
t1.add(e2);
t1.add(e3);
t1.add(e4);

System.out.println(t1);
}//eof main
}//eof c

class myC implements Comparator{
	public int compare(Object o1,Object o2){
return -(((Employee)o2).name).compareTo(((Employee)o1).name);
}//eof compare
}//eof myC







 




 