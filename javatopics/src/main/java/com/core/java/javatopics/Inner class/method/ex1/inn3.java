//cannot acces loc var inside method inner class
//need to declare as final
//if we decalre final var than at compile time it is replaced by its value
//if we dont than the after method completion t will be reomved from stack
//but the obj may still be present in heap
//and we can dieectly use this object to call a() method but than var is no more
//but in jdk 10 it is not givig any error
class out2{

public void d(){
int a=2;		//local var
class inn2a{
public void a(){
System.out.println(a);//--->cannot access local var

}}
inn2a i=new inn2a();
i.a();
}
}

public class inn3{
public static void main(String args[]){
out2 a=new out2();
a.d();
}
}