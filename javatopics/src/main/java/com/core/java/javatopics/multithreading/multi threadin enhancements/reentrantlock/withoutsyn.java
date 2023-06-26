//op->mixed output
class d{
public void m1(String name){
for(int i=0;i<=10;i++){
System.out.print("good :");
try{Thread.sleep(2000);}
catch(InterruptedException e){}
System.out.println(name);
}
}
}
class ct extends Thread{
String name;
d d1;
ct(d d1,String name){this.d1=d1;
this.name=name;}
public void run(){
d1.m1(name);
}
}
public class withoutsyn{
public static void main(String args[]){
d d1=new d();
ct t1=new ct(d1,"dhoni");
ct t2=new ct(d1,"yuvi");
t1.start();
t2.start();

}
}