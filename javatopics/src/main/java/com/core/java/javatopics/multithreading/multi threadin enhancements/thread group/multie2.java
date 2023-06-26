// after setting the new max priority to 3 
//this will be the priority of only the new thread
//hence this seting of priority will not effect the previous thread priority
//default priority of threadgroup is 10
//default priority of thread is 5

public class multie2{
public static void main(String args[]){

ThreadGroup t=new ThreadGroup("tg");
Thread t1=new Thread(t,"first");
Thread t2=new Thread(t,"second");
t.setMaxPriority(3);
Thread t3=new Thread(t,"third");
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
System.out.println(t3.getName());
}
}