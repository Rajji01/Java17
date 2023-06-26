public class td1{
public static void main(String args[]){
Runnable t =new Runnable()
{
public void run(){for(int i=0;i<10;i++){System.out.println("child thread");}}
};
Thread t1=new Thread(t);
t1.start();
for(int i=0;i<=10;i++){System.out.println("main thread");}
}
} 