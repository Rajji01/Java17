//method local inner class
//if it is decalred inside instance method than it can access 
//both static and instance data members
class out1{
int a=1;
static int b=2;
public static void d(){
class inn1a{
public void a(){
//System.out.println(a);--->cannot access non static from static
System.out.println(b);
}}
inn1a i=new inn1a();
i.a();
}
}

public class inn2{
public static void main(String args[]){
out1 a=new out1();
a.d();
}
}