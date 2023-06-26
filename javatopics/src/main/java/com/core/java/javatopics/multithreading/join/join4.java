//deadlock example
public class join4{

public static void main(String args[])throws InterruptedException{

Thread.currentThread().join();     //main thread calls join method to wait until the execution of main thread
}
}