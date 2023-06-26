class display1{
public synchronized void disi(){
for(int i=0;i<10;i++)
{
System.out.println(i);
try{Thread.sleep(2000);}
catch(InterruptedException e){}
}
}
public synchronized void disc(){
for(int i=65;i<=75;i++)
{
System.out.println((char)i);
try{Thread.sleep(2000);}
catch(InterruptedException e ){}
}
}

}
class mta1 extends Thread{
display1 d;
mta1 (display1 d){this.d=d;}
public void run(){d.disi();}
}
class mtb1 extends Thread{
display1 d;
mtb1 (display1 d){this.d=d;}
public void run(){d.disc();}
}
public class sy6{
public static void main(String args[]){
display1 d1=new display1();
mta1 t=new mta1(d1);
mtb1 t1=new mtb1(d1);
t.start();
t1.start();
}}