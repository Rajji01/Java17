class demo extends Thread
{
public void run(){
for(int i=0;i<=10;i++){System.out.println("child thread");}
}


}
public class td{
public static void main(String args[]){
demo d=new demo();

d.start();

for(int i=0;i<=10;i++){System.out.println("main thread");}

}
}