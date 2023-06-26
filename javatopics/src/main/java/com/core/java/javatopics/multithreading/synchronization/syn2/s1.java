//syn method and multiple thread on same object
class d{
public synchronized void show(String name){
for(int i=0;i<=6;i++)
{System.out.println("its time for thread"+name);
try{Thread.sleep(2000);}
catch(InterruptedException e){System.out.println("interruption occurred");}
}
}
}
class mt extends Thread{
d d1;
String name;
mt(d d1,String name){this.d1=d1;
this.name=name;
}
public void run(){
d1.show(name);
}
}

class s1
{ 
public static void main(String args[]){
d d1=new d();
mt t1=new mt(d1,"first");
mt t2=new mt(d1,"second");
t1.start();
t2.start();
for(int i=0;i<=5;i++)
System.out.println("main thread");
}}