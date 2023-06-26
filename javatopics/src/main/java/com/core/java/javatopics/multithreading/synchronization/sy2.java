class dis1{
public void wish(String name){
for(int i=0;i<10;i++)
{
System.out.print("good morning:");		// iff it is not synchronized than 
try{Thread.sleep(2000);}			// if 1 thread gets sleep the other will execute itself
catch(InterruptedException e){}			//who will execute first dont know but
System.out.println(name);			// the order of execution will be unpredictable
}
}
}

class mt1 extends Thread{
dis1 d;
String name;
mt1(dis1 d,String name){this.name=name;
this.d=d;}
public void run(){d.wish(name);}

}
public class sy2{
public static void main(String args[]){
dis1 d1=new dis1();			//object of display created
mt1 t1=new mt1(d1,"dhoni");		//thread t1 in new /born state
mt1 t2=new mt1(d1,"cook");		// similar t2
t1.start();				//t1 in runnable/ready calls run()
t2.start();				//similarly t2 calls run method
}
}