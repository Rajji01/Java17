//without deadlock
//d1 and d2 syn and  last is also syn()
//main thread gets lock of a
//child thread gets lock of b
//but main thread  now req lock of b obj to execute last of b
//similarly child needs  the lock of a to execute last of a
//since no thread is willing to let go of its lock we eill get a deadlock

class A2{
public synchronized void d1(B2 b){
System.out.println("inside d1 ");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
b.last();}
public synchronized void last(){System.out.println("last of class A executed by child");}
}
class B2{
public synchronized void d2(A2 a){
System.out.println("inside d2");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
a.last();}
public synchronized void last(){
System.out.println("last of B executed by main");
}
}

public class dead3 extends Thread{
A2 a=new A2();
B2 b=new B2();
void m(){this.start();
a.d1(b);}
public void run(){b.d2(a);}
public static void main(String args[]){
dead3 d1=new dead3();
d1.m();
}
}