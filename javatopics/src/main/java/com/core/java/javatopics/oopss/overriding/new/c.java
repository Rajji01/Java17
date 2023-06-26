class d{private void o1(){System.out.println("parent");}}

class c extends d{
public void o1(){System.out.println("child");}

c(){ }

public static void main(String args[]){
c d1=new c();
d1.o1();
d d2=new c();
d2.o1();
//d2.o2();
//((d)c1).o1();
} 
}