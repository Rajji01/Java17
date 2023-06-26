import java.util.concurrent.locks.ReentrantLock;
public class reentrantl{
public static void main(String args[]){
ReentrantLock l=new ReentrantLock();
l.lock();		//only 1 hold
 
l.lock();		//now 2 holds
System.out.println(l.isLocked());			//true
System.out.println(l.isHeldByCurrentThread());		//true
System.out.println(l.getQueueLength());			//0

l.unlock();
System.out.println(l.isLocked());			//true
System.out.println(l.getHoldCount());			//1

l.unlock();
System.out.println(l.isLocked());			//false
System.out.println(l.isFair());				//false


}
}