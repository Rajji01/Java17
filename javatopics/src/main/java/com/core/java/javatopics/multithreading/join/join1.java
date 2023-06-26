//join method case2 child thread waiting for main thread to complete

class mt extends Thread{
static Thread m1;				// for getting the reference of main thread in child thread
public void run(){
	try{m1.join();}				//wait untli main thread completes
	catch(InterruptedException e){}

	for(int i=0;i<10;i++){			//than print child thread 10 timms
	System.out.println("child thread");}
}



} 


public class join1 {
public static void main(String args[])throws InterruptedException{
mt.m1=Thread.currentThread();	//puttting the refid of main thread in ref var of child thread thats why we made it static
mt  t=new mt();			// child thread created in new state
t.start();			// child thread in runnable state or ready
for(int i=0;i<10;i++)
{
System.out.println("main thread");
Thread.sleep(1000);
}

}
}
