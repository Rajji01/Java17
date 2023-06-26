/* system
	|
	main
	|
	parent
	| 	         |		|
	first(t)	second(t)  	child(tg)
*/
//t->thread
//tg->thread group
class ct2 extends Thread{
ct2(ThreadGroup g,String name){super(g,name);}		//-->which threads belong to which thread group
public void run(){
System.out.println("child thread");
try{Thread.sleep(5000);}
catch(InterruptedException e){}
}
}
public class multie4 {
public static void main(String args[])throws Exception{
ThreadGroup pg=new ThreadGroup("parent");
ThreadGroup cg=new ThreadGroup(pg,"child");
ct2 t1=new ct2(pg,"first");
ct2 t2=new ct2(pg,"second");
t1.start();
t2.start();
System.out.println(pg.activeCount());		//o/p->2 active threads present
System.out.println(pg.activeGroupCount());	//o/p->	1
pg.list();					//gives info about threadgroup contains active t1,t2 and threadgroup cg
Thread.sleep(10000);
System.out.println(pg.activeCount());		//o/p->0 active threads presentbecause in 10 sec the two threads will be finished
System.out.println(pg.activeGroupCount());	//o/p->	1
pg.list();					// gives info active only thread group
}
}