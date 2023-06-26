//defining  thread through Runnable interface 

class mr extends Thread{

}


public class multi18{
public static void main(String args[]){
System.out.println(Thread.currentThread().getName());	//main thread
mr r=new mr();
System.out.println(r.getName());		//default thread name Thread-0
Thread.currentThread().setName("my method baby");	//name of main threa changed to my method baby
System.out.println(Thread.currentThread().getName());	// name of threa my method baby
System.out.println(10/0);
}}