//defining  thread through Runnable interface 

class mr implements Runnable{
public void run(){for(int i=0;i<10;i++){	
System.out.println("child thread");
}}
}


public class multi14{
public static void main(String args[]){
mr r=new mr();
Thread t=new Thread(r);			// new thread created
t.start();				
r.run();				// normal method
for(int i=0;i<10;i++)			
{System.out.println("main thread");}
}
}