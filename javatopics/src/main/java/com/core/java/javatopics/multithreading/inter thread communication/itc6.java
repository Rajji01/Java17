//SOLUTION OF ITC5.JAVA BY CALLING WAIT FOR FOR SPECIFIC AMOUNT OF TIME
//because wait ,notify,notifyall can be called only from synchronised (owner of thread,lock of thread,syn)
//if there is no one to notify main method after calling wait on child than it will hang or will run for infinity
//because we dont want to hang our proram
class ct3 extends Thread {
int tot=0;
public void run(){
synchronized(this){
System.out.println("chid threads start claculation");
for(int i=0;i<=100;i++)
{tot=tot+i;}
this.notify();
System.out.println("chid thread trying to give notification to main thread");
}
}
  

}
public class itc6 extends Thread{
public static void main(String args[]) throws InterruptedException{
ct3 c1=new ct3();
c1.start();
c1.sleep(2000);			//this will result in execution of run method and notify method before wait
synchronized(c1){
System.out.println("main thread trying to call chid thread");
c1.wait(10000);				//hence when we call wait method than we will not get the notification of it 
System.out.println("main thread got notification");
}
System.out.println(c1.tot);


}
}