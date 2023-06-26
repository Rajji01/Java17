//o/p->always 0 and thread got interrupted
class ct extends Thread{

public void run(){
try{
for(int i=0;i<10;i++)   {
System.out.println(i);
Thread.sleep(1000);
			}
}
catch(InterruptedException e)
{System.out.println("thread got interrupted");
}

}

}


public class ie1 {
public static void main(String args[])throws InterruptedException{
ct c1=new ct();
c1.start();
c1.interrupt();			// can only interrupt sleeping thread or waiting thread
System.out.println("end of main");
}
}