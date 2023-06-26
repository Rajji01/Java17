// thread pool
//all ready created pool of thread is konwn as tpool
//creating separate thread for each job can bring down the performance of the system
//first create it and than start it than stop it
//so tpool gives us the advantage of using already created pool
//for ex there are 100 independent jobs than for we have to create 100 threads to exceute these jobs
//now for ex we have tpool of 3 threads than these 3 already created threads will be used again again 
//until the completion of theses jobs
//tpool concept is this that we can reuse the previously create thread again again
//tpool similar to connectio pool
//while designing web servers we use thread pool concept is used
//for ex user send 10 req than threads from thread pool will execute these req
import java.util.concurrent.*;
class pjob implements  Runnable
{
String name;
pjob(String name){this.name=name;}
public void run(){
System.out.println(name+"job started by thread"+Thread.currentThread().getName());
try{Thread.sleep(5000);}
catch(InterruptedException e){}
System.out.println(name+"job completed by thread"+Thread.currentThread());
}
}
public class tpool{
public static void main(String args[]){
pjob[] jobs={new pjob("j1"),
	     new pjob("j2"),
	     new pjob("j3"),
	     new pjob("j4"),
	     new pjob("j5"),
	     new pjob("j6")	};
ExecutorService service=Executors.newFixedThreadPool(3);
for(pjob j:jobs){service.submit(j);}
service.shutdown();
}
}