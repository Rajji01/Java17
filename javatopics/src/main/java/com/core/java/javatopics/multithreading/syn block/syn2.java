//syn block exa
//syn block improves performance and reduces the waiting time of the thread
//only for loop should be putted inside the syn block
// both objects hence the o/p is both threads will not execute simutaneously (one by one)
//because now there is class lvl lock
class disb{
public void dis1(String n){
System.out.println("1st");
System.out.println("2st");
System.out.println("3st");
System.out.println("4st");
System.out.println("5st");
System.out.println("6st");
System.out.println("7st");
System.out.println("8st");
synchronized(disb.class){ for(int i=0;i<10;i++)	// class lvl lock
{
System.out.println(i);
try{Thread.sleep(1000);}
catch(InterruptedException e){}
System.out.println(n);
}}

System.out.println("9st");
System.out.println("10st");
System.out.println("11st");
System.out.println("12st");
System.out.println("13st");
System.out.println("14st");
System.out.println("15st");
System.out.println("16");

}


}
class mt2 extends Thread{
disb d;
String n;
mt2(disb d,String n){
this.d=d;
this.n=n;}
public void run(){
d.dis1(n);
}
}
public class syn2{
public static void main(String args[]){
disb d=new disb();
disb d1=new disb();
mt2 t=new mt2(d,"dhoni");
mt2 t1=new mt2(d1,"kohli");
t.start();
t1.start();

}
}