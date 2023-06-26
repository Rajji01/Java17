//o/p->always 0 and thread got interrupted
class ct extends Thread{
//example of waiting of interrupt call by the child thread until execution of for loop
//interrupt call never gets wasted even if child thread was not in sleep/wait state it wait for them to come into these states
public void run(){

for(int i=0;i<1000;i++)   {
System.out.println(i);}
try{Thread.sleep(2000);			}

catch(InterruptedException e)
{System.out.println("thread got interrupted");
}

}

}


public class ie2 {
public static void main(String args[])throws InterruptedException{
ct c1=new ct();
c1.start();
c1.interrupt();			// can only interrupt sleeping thread or waiting thread
System.out.println("end of main");
}
}