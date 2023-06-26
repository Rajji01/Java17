//without deadlock
//d1 and d2 syn but last is not syn()
//main thread gets lock of a
//child thread gets lock of b
//but main thread does not erq lock of b obj to execute last of b
//similarly child does not req the lock of a to execute last of a

class A1{
public synchronized void d1(B1 b){
System.out.println("inside d1 ");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
b.last();}
public void last(){System.out.println("last of class A executed by child");}
}
class B1{
public synchronized void d2(A1 a){
System.out.println("inside d2");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
a.last();}
public void last(){
System.out.println("last of B executed by main");
}
}

public class dead2 extends Thread{
A1 a=new A1();
B1 b=new B1();
void m(){this.start();
a.d1(b);}
public void run(){b.d2(a);}
public static void main(String args[]){
dead2 d1=new dead2();
d1.m();
}
}