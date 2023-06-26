//defining  thread through Runnable interface 
class mr extends Thread{
public void run(){	
System.out.println("child thread");
}}



public class multi15{
public static void main(String args[]){
mr r=new mr();
Thread t=new Thread(r);			
t.start();
System.out.println("main method");
}
}