//thread local is used to create thread local var
// a thread loc var can be accessed by the executing thread any where in the prog
//but the condition is that we can access only through the current thread
//thread local is used to define the scope of a thread
//default value of a threadloc var is null
// we can modify it also'
//we can remove it also 
//after removing it we can still access it 
//because the value is reinitialised to null  
import java.lang.*;
public class tlocal{
public static void main(String args[]){
ThreadLocal tl=new ThreadLocal();
System.out.println(tl);				//null
tl.set("rajji");
System.out.println(tl);				//rajji
tl.remove();
System.out.println(tl);				//null(reinitialised to null)
}
}
