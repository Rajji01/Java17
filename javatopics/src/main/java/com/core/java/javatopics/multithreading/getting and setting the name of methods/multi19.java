//defining  thread through Runnable interface 

class mr extends Thread{
public void run(){System.out.println("run method executed by thread"+Thread.currentThread().getName());}
}


public class multi19{
public static void main(String args[]){
mr r=new mr();
r.start();
System.out.println("main method executed by thread"+Thread.currentThread().getName());
}}