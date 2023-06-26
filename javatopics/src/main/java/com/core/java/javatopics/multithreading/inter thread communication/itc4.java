
//because wait ,notify,notifyall can be called only from synchronised (owner of thread,lock of thread,syn)
//most important example because in this example even if thread was sleeped for 1 sec in this case the output would that we want is 5050
//in this case the output that is generated is correct even thoug run is not complete because we have used wait and notify to give the accurate result after calculations
class ct1 extends Thread {
int tot=0;
public void run(){
synchronized(this){
System.out.println("chid threads start claculation");
for(int i=0;i<=100;i++)
{tot=tot+i;}
this.notify();
System.out.println("chid thread trying to give notification to main thread");
}
try{Thread.sleep(1000);}
catch(InterruptedException e){}
System.out.println("chid thread trying to give notification to main thread1");
System.out.println("chid thread trying to give notification to main thread1");
System.out.println("chid thread trying to give notification to main thread1");
}
}


public class itc4 extends Thread{
public static void main(String args[]) throws InterruptedException{
ct1 c1=new ct1();
c1.start();
synchronized(c1){
System.out.println("main thread trying to call chid thread");
c1.wait();
System.out.println("main thread got notification");
}
System.out.println(c1.tot);
}
}