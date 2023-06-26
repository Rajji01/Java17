class tb extends Thread{
int tot=0;
public void run(){
for(int i=0;i<=50;i++){tot=tot+i;}
}
}



public class itc{
public static void main(String args[]){
tb t=new tb();
t.start();
System.out.println("total="+t.tot);

}
}