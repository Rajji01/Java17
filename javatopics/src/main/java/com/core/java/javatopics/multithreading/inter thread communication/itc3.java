//o/p->IllegalMonitor state exception
//because wait ,notify,notifyall can be called only from synchronised (owner of thread,lock of thread,syn)

class ct extends Thread {
int tot=0;
public void run(){
for(int i=0;i<=100;i++)
{tot=tot+i;}
this.notify();
}
  

}
public class itc3 extends Thread{
public static void main(String args[]) throws InterruptedException{
ct c1=new ct();
c1.start();
c1.wait();
System.out.println(c1.tot);


}
}