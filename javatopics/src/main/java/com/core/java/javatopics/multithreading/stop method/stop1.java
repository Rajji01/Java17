//we can stop a thread by using stop()
//this will result in dead state of thread
//stoping a thread is similar to killing a thread
//not recomended to use because some time for ex
//thread opens a DB CONECTION and before closing it we stoped it 
//than we lost a DB CONNECTION(wasted)

class ct extends Thread{
public void run(){
for(int i=0;i<=10;i++){
System.out.println("child thread");
try{Thread.sleep(2000);}
catch(InterruptedException e){}
}
}

}


public class stop1{
public static void main(String args[]){

ct t=new ct();
t.start();
System.out.println("end of main");
//t.stop();---------------------------------->if not commented than child thread will execute fully
}
}