// static synchronized
// mutiple threads on multiple objects
//o/p-> regular o/p
//because if mul threads operating simultaneously on diff java obj and it is static syn() 
//than thread requries class lvl lock
//if one thread ocuupies the class lvl lock than others requesting threads have to wait until
// the current executing threads is finished then the lock is free
class dis3{
public static synchronized void wish(String name){
for(int i=0;i<10;i++)
{
System.out.print("good morning:");		// iff it is static synchronize than it matters
try{Thread.sleep(2000);}			
catch(InterruptedException e){}			//who will execute first dont know but
System.out.println(name);			// the order of execution will be regular
						//because ml thread operating on multiple java obj but 
						//method is static syn()
}
}
}

class mt3 extends Thread{
dis3 d;
String name;
mt3(dis3 d,String name){this.name=name;
this.d=d;}
public void run(){d.wish(name);}

}
public class sy4{
public static void main(String args[]){
dis3 d1=new dis3();			//1st object of display created
dis3 d2=new dis3();			//2nd object of display created
mt3 t1=new mt3(d1,"dhoni");		//thread t1 in new /born state
mt3 t2=new mt3(d2 ,"cook");		// similar t2
t1.start();				//t1 in runnable/ready calls run()
t2.start();				//similarly t2 calls run method
}
}