import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
import java.util.concurrent.*;

class mt{
int n;
mt(int n){this.n=n;}
public Object call() throws Exception{
System.out.println(Thread.currentThread().getName()+"is responsible for calculating the sum of"+""+n+"numbers");
int sum=0;
for(int i=0;i<5;i++){
sum=sum+i;
}
return sum;
}

}
public class callable1{
public static void main(String args[]) throws Exception{
mt[] jobs={new mt(10),
		 new mt(20),
		 new mt(30),
		 new mt(40),
		 new mt(50),
		 new mt(60)};
ExecutorService service=Executors.newFixedThreadPool(3);
for(mt j:jobs){
Future f=service.submit(j);
System.out.println(f.get());}
service.shutdown();
}

}