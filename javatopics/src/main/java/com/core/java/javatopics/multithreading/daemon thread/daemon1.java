//if we are not commenting lin1 than main thread is nond but child thread is daemon 
//hence when ever main thread is finished executing than child thread will be terminated because it is daemon
//if we are not commenting line 1 than both threads are non d than both will be executed completly
//when ever the last non daemon thread is finished than all daemon threads are finished irrespective of their states
class sct1 extends Thread{

public void run(){
for(int i=0;i<=10;i++)
{
System.out.println("child thread");
try{Thread.sleep(1000);}
catch(InterruptedException e){}
}

}
}



public class daemon1{
public static void main(String args[]){
	sct1 t1=new sct1();
	t1.setDaemon(true);		//--->line 1
	t1.start();
	System.out.println("end of main thread");
}
}