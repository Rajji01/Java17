// wait will force the child to execute first completely and we will get the desired o/p
// but it is not recommended to use join() method because
// we only require for loop for calcultions of tot var
// assume if there are 1 crore lines after for loop 
//than  it will have to wait until the exceution of these 1crore lines
// if you are expecting some updations than do not go for sleep and join methods
class tb2 extends Thread{
int tot=0;
public void run(){
for(int i=0;i<=100;i++)
{tot=tot+i;}
// 1crore lines of code
}
}

public class itc2{
public static void main(String args[]) throws InterruptedException{
tb2 t=new tb2();
t.start();
t.join();				//waits for the other thread to complete gives complete o/p
System.out.println("total="+t.tot);
}
}