//getClass() returns runtime defination of an object

import java.lang.reflect.*;
public class jl2{
public static void main(String[] args){
int count=0;
Object o=new String("rajji");

System.out.println("class name is"+o.getClass().getName());
Method[] m=o.getClass().getDeclaredMethods();
for(Method m1:m){
count++;
System.out.println(m1.getName());
}
System.out.println("total methods"+count);

}
}