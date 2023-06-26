//defining  thread through Runnable interface 

class mr implements Runnable{
public void run(){for(int i=0;i<10;i++){	// executed by child thread once and than as normal method
System.out.println("child thread");
}}
}


public class multi12{
public static void main(String args[]){
mr r=new mr();
Thread t=new Thread(r);			// new thread created
t.start();				//run method of mr will be called
t.run();				//executed as nomal method no new thread created
for(int i=0;i<10;i++)			//executed by main thread
{System.out.println("main thread");}
}
}