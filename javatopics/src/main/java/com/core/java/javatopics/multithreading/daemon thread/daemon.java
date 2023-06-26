//daemon threads are the threads which execute in background
//they support for non daemon threads
//for ex when main threads is on l ow memory than jvm runs GC
//GC purpose is to support the non daemon thread main thread
//daemon thread from begining are on low priority
//but according to situations there priority is increased for ex GC
//Main thread is always non Daemon because it is already started by jvm at begining
// we can change the nature of thread to daemon and vicec versa
//but we can only change it before starting of a thread
//default nature is parent to child relationship
//for ex if pareb=nt is non daemon than thread will also be non daemon
//cann not change the main thread nature

class sct extends Thread{}
public class daemon{
public static void main(String args[]){
System.out.println(Thread.currentThread().isDaemon());		//checking the nature of main thread
//Thread.currentThread().setDaemon(true);------------------------>can not change the main thread
sct t1=new sct();
System.out.println(t1.isDaemon());				//parent nond than child also nond
t1.setDaemon(true);						// changed to daemon
System.out.println(t1.isDaemon());				//true
t1.start();
//t1.setDaemon();------------------------------------------------->cannot because thread is already started
		
}
}