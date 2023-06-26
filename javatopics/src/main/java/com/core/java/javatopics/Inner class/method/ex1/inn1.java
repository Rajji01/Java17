//method local inner class
//if it is decalred inside instance method than it can access 
//both static and instance data members
class out{
int a=1;
static int b=2;
public void d(){
class inn{
public void a(){
System.out.println(a);
System.out.println(b);
}}

inn i=new inn();
i.a();


}
}
public class inn1{
public static void main(String args[]){
out a=new out();
a.d();
}
}