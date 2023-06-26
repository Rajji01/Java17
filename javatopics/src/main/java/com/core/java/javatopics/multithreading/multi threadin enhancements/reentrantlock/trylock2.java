// in this case even when the lock is accoupied by one thread
//the other thread req for lock and if not found it is going to execute something 
//than it will try again using do while loop
// in this the other thread does not wait
//which is not possible through syn keyword

import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class mt extends Thread{
static ReentrantLock l=new ReentrantLock();

mt(String name){
super(name);
}

public void run(){
do{
try{
if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
System.out.println(Thread.currentThread().getName()+" "+ "ocuupied the lock hurrah");
Thread.sleep(30000);
l.unlock();
System.out.println(Thread.currentThread().getName()+" "+ "release the lock hurrah");
break;

}
else{
System.out.println(Thread.currentThread().getName()+" "+ "not ocuupied the lock but will try again");
}
}
catch(Exception e){}
}
while(true);
}
}
public class trylock2{
public static void main(String args[]){
mt t1=new mt("first");
mt t2=new mt("second");
t1.start();
t2.start();


}
}