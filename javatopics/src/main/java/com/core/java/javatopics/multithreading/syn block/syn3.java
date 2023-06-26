// lock concept applicable for obj and class not for primitives
class disc{
public void dis1(String n){
System.out.println("1st");
System.out.println("2st");
System.out.println("3st");
System.out.println("4st");
System.out.println("5st");
System.out.println("6st");
System.out.println("7st");
System.out.println("8st");
int x=10;
synchronized(x){ for(int i=0;i<10;i++)	// primitive not applicable req reference CT:ERROR
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
class mt3 extends Thread{
disc d;
String n;
mt3(disc d,String n){
this.d=d;
this.n=n;}
public void run(){
d.dis1(n);
}
}
public class syn3{
public static void main(String args[]){
disc d=new disc();
disc d1=new disc();
mt3 t=new mt3(d,"dhoni");
mt3 t1=new mt3(d1,"kohli");
t.start();
t1.start();

}
}