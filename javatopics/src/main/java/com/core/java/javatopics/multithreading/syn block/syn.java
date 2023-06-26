//syn block exa
//syn block improves performance and reduces the waiting time of the thread
//only for loop should be putted inside the syn block
class dis{
public void dis1(String n){
System.out.println("1st");
System.out.println("2st");
System.out.println("3st");
System.out.println("4st");
System.out.println("5st");
System.out.println("6st");
System.out.println("7st");
System.out.println("8st");
synchronized(this){ for(int i=0;i<10;i++)
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
class mt extends Thread{
dis d;
String n;
mt(dis d,String n){
this.d=d;
this.n=n;}
public void run(){
d.dis1(n);
}
}
public class syn{
public static void main(String args[]){
dis d=new dis();
mt t=new mt(d,"dhoni");
mt t1=new mt(d,"kohli");
t.start();
t1.start();

}
}