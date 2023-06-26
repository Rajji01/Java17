//without deadlock
//no syn method or block hence no lock req
class A{
public void d1(B b){
System.out.println("inside d1 ");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
b.last();}
public void last(){System.out.println("last of class A executed by child");}

}
class B{
public void d2(A a){
System.out.println("inside d2");
try{Thread.sleep(6000);}
catch(InterruptedException e){}
a.last();}

public void last(){
System.out.println("last of B executed by main");
}

}
public class dead1 extends Thread{
A a=new A();
B b=new B();
void m(){this.start();
a.d1(b);}
public void run(){b.d2(a);}
public static void main(String args[]){

dead1 d1=new dead1();
d1.m();


}
}