class display{
public void disi(){
for(int i=0;i<10;i++)
{
System.out.println(i);
try{Thread.sleep(2000);}
catch(InterruptedException e){}
}
}
public void disc(){
for(int i=65;i<=75;i++)
{
System.out.println((char)i);
try{Thread.sleep(2000);}
catch(InterruptedException e ){}
}
}

}
class mta extends Thread{
display d;
mta (display d){this.d=d;}
public void run(){d.disi();}
}
class mtb extends Thread{
display d;
mtb (display d){this.d=d;}
public void run(){d.disc();}
}
public class sy5{
public static void main(String args[]){
display d1=new display();
mta t=new mta(d1);
mtb t1=new mtb(d1);
t.start();
t1.start();
}}