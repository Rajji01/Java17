//const no. 1
//ThreadGroup t=new ThreadGroup("first group");
//this thread group is the child of currently executing thread or the thread which calls it
//const() no. 2
//ThreadGroup t1=new ThreadGroup(t,"second group");
// first group is the parent group of second group
// in const no. 2 we can specify the parent group of new created thread group
/*syetem
     |
     main
	|
	first
	  |
	  second
*/	

public class multie1{
public static void main(String args[]){

ThreadGroup t1=new ThreadGroup("first");
System.out.println(t1.getParent().getName());		//o/p->main
ThreadGroup t2=new ThreadGroup(t1,"second");
System.out.println(t2.getParent().getName());
}
}