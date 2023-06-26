
//through genrics we provide  type safety to collections
//we can also use generics in normal classes also
import java.util.*;
class gna<t>{
t obj;
 gna(t obj){this.obj=obj;}
public void show(){
System.out.println("the object type is"+obj.getClass().getName());
}
public t getobj(){return obj;}
}
public class maingn{
public static void main(String args[]){
gna<String> i=new gna<String>("rajji"); 
i.show();
System.out.println(i.getobj());
gna<Integer> i1=new gna<Integer>(10); 
i1.show();
System.out.println(i1.getobj());
}}