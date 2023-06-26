class parent extends Thread{
public static ThreadLocal t=new ThreadLocal();
public void run(){
t.set("pp");
System.out.println("parent ="+t.get());
child c=new child();
c.start();
}
}
class child extends Thread{
public void run(){
System.out.println("child ="+t.get());
}
}
public class tlocal2{
public static void main(String args[]){
parent p1=new parent();
p1.start();
}
}