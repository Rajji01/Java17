// mutiple threads on multiple objects
//o/p-> irregular o/p
//because if mul threads operating simultaneously on diff java obj than syn is not required
//both will be xecuted simmultaneously
//if mul thread are operating on single java obj than syn is requried
class dis2{
public void wish(String name){
for(int i=0;i<10;i++)
{
System.out.print("good morning:");		// iff it is synchronized or not doesnt matter 
try{Thread.sleep(2000);}			
catch(InterruptedException e){}			//who will execute first dont know but
System.out.println(name);			// the order of execution will be unpredictable
						//because ml thread operating on multiple java obj
}
}
}

class mt2 extends Thread{
dis2 d;
String name;
mt2(dis2 d,String name){this.name=name;
this.d=d;}
public void run(){d.wish(name);}

}
public class sy3{
public static void main(String args[]){
dis2 d1=new dis2();			//1st object of display created
dis2 d2=new dis2();			//2nd object of display created
mt2 t1=new mt2(d1,"dhoni");		//thread t1 in new /born state
mt2 t2=new mt2(d2 ,"cook");		// similar t2
t1.start();				//t1 in runnable/ready calls run()
t2.start();				//similarly t2 calls run method
}
}