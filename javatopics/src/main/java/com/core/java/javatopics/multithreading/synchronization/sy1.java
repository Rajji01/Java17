class dis{
public synchronized void wish(String name){
for(int i=0;i<10;i++)
{
System.out.print("good morning:");
try{Thread.sleep(2000);}		//dont who will execute it first but
catch(InterruptedException e){}		// if one thread aquired even if it is sleeping the other thread 
System.out.println(name);		//can not acces it has to wait until the other thread is finished
}
}
}

class mt extends Thread{
dis d;
String name;
mt(dis d,String name){this.name=name;
this.d=d;}
public void run(){d.wish(name);}

}
public class sy1{
public static void main(String args[]){
dis d1=new dis();
mt t1=new mt(d1,"dhoni");
mt t2=new mt(d1,"cook");
t1.start();
t2.start();
}
}