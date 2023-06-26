// in this case even when the lock is accoupied by one thread
//the other thread req for lock and if not found it is not waiting it is doing something
// in this the other thread does not wait
//which is not possible through syn keyword

import java.util.concurrent.locks.*;
class mt extends Thread{
static ReentrantLock l=new ReentrantLock();

mt(String name){
super(name);
}

public void run(){
if(l.tryLock()){
System.out.println(Thread.currentThread().getName()+" "+ "ocuupied the lock hurrah");
try{Thread.sleep(2000);}
catch(InterruptedException e){}
l.unlock();
}
else{
System.out.println(Thread.currentThread().getName()+" "+ "not ocuupied the lock but still doing something");
}
}
}
public class trylock1{
public static void main(String args[]){
mt t1=new mt("first");
mt t2=new mt("second");
t1.start();
t2.start();


}
}