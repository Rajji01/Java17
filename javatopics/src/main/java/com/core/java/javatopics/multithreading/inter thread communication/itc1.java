// because we call sleep it will give the opportunity to the other thread hence op will be 4950
// but thread.sleep not recommended because of following reasons
// 1->because it makes the program wait for more time than required  the computer execution is fast
//2-> if there is some big calculations and the time of sleep is finished tha it will give midway o/p
//hence if  you are waiting for some updation and you call sleep method than it is not recomended
class tb1 extends Thread{
int tot=0;
public void run(){
for(int i=0;i<=100;i++)
{tot=tot+i;}
}
}

public class itc1{
public static void main(String args[]) throws InterruptedException{
tb1 t=new tb1();
t.start();
t.sleep(60000);
System.out.println("total="+t.tot);
}
}