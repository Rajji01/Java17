class d{
  public static synchronized void dis(String name){
for(int i=0;i<=10;i++){
System.out.println("good morning");
try{Thread.sleep(1000);}
catch(InterruptedException e){}
System.out.println(name);}
}
public  static synchronized void dis1(String name){
for(int i=0;i<=10;i++){
System.out.println("bye bye");
try{Thread.sleep(1000);}
catch(InterruptedException e){}
System.out.println(name);}
}
}

class mt extends Thread{
d d1;
String name;
mt(d d1,String name){
this.name=name;
this.d1=d1;
}
public void run(){
d1.dis(name);
}
}
class mz extends Thread{
d d1;
String name;
mz(d d1,String name){
this.name=name;
this.d1=d1;
}
public void run(){
d1.dis1(name);
}
}

public class s1{
public static void main(String args[]){
d d1=new d();
d d2=new d();
mt t=new mt(d1,"first");
mz t2=new mz(d2,"second");
t.start();
t2.start();
}
}