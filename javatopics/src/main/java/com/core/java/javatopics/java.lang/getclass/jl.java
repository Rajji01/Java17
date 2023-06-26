//getClass() returns runtime defination of an object
//public final class getClass
import java.lang.reflect.*;
public class jl{
public static void main(String[] args){
int count=0;
Object o=new String("rajji");
Class c=o.getClass();
System.out.println("class name is"+c.getName());
Method[] m=c.getDeclaredMethods();
for(Method m1:m){
count++;
System.out.println(m1.getName());
}
System.out.println("total methods"+count);

}
}