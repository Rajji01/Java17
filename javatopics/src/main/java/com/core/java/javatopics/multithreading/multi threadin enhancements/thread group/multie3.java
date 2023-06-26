class ct1 extends Thread{
ct1(ThreadGroup g,String name){super(g,name);}

public void run(){
System.out.println("child thread");
try{Thread.sleep(5000);}
catch(InterruptedException e){}

}
}

public class multie3{
public static void main(String args[]){
ThreadGroup pg=new ThreadGroup("parent");
ThreadGroup cg=new ThreadGroup(pg,"child");
ct1 t1=new ct1(pg,"first");
ct1 t2=new ct1(pg,"second");
t1.start();
t2.start();
System.out.println(pg.activeCount());		//o/p->2 active threads present
System.out.println(pg.activeGroupCount());	//o/p->	1
pg.list();					//gives info about threadgroup contains t1,t2 and threadgroup cg

}
}