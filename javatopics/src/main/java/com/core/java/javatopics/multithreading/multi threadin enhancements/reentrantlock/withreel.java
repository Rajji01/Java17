//op->regular op
//same thing done by reentrant lock as done by syn keyword
//if we comment lin1 and line 2 than we will get irregular keyword
import java.util.concurrent.locks.*;
class dn1{
ReentrantLock l=new ReentrantLock();		//line1
public  void m1(String name){
l.lock();
for(int i=0;i<=10;i++){
System.out.print("good :");
try{Thread.sleep(2000);}
catch(InterruptedException e){}
System.out.println(name);
}
l.unlock();					//line 2
}
}
class ct2 extends Thread{
String name;
dn1 d1;
ct2(dn1 d1,String name){this.d1=d1;
this.name=name;}
public void run(){
d1.m1(name);
}
}
public class withreel{
public static void main(String args[]){
dn1 d1=new dn1();
ct2 t1=new ct2(d1,"dhoni");
ct2 t2=new ct2(d1,"yuvi");
t1.start();
t2.start();

}
}