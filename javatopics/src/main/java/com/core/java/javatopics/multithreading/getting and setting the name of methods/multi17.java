//defining  thread through Runnable interface 

class mr extends Thread{

}


public class multi17{
public static void main(String args[]){
System.out.println(Thread.currentThread().getName());	//main thread
mr r=new mr();
System.out.println(r.getName());		//default thread name Thread-0


}}