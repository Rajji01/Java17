//op->mixed output
class dn{
public synchronized void m1(String name){
for(int i=0;i<=10;i++){
System.out.print("good :");
try{Thread.sleep(2000);}
catch(InterruptedException e){}
System.out.println(name);
}
}
}
class ct1 extends Thread{
String name;
dn d1;
ct1(dn d1,String name){this.d1=d1;
this.name=name;}
public void run(){
d1.m1(name);
}
}
public class withsyn{
public static void main(String args[]){
dn d1=new dn();
ct1 t1=new ct1(d1,"dhoni");
ct1 t2=new ct1(d1,"yuvi");
t1.start();
t2.start();

}
}