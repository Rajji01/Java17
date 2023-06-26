public class multi5{
public static void main(String args[]){
ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();		//taking the ref of system tg
Thread[] t=new Thread[system.activeCount()];					//making a thread array of actiive no. threads
system.enumerate(t);								// copying active threads into t
for(Thread t1:t){System.out.println(t1.getName()+""+t1.isDaemon());}		//printing thread name and is daemon or not
}
}