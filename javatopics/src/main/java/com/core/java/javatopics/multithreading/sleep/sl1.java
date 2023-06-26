// sleep() method is called when a thread wants to pause for a given time only
public class sl1{

public static void main(String args[]) throws InterruptedException{
for(int i=0;i<10;i++){
System.out.println("main thred");
Thread.currentThread().sleep(1000);}
}
}