//method local inner class
//same as a loc var in method can only be final same is the case of method
//method loc class
//method local class can only be final,strictfp,abstract

class out6{
int a=1;
static int b=2;
public void d(){
  class inna{	//-->can only be final,strictfp,abstract
public void a(){
System.out.println(a);
System.out.println(b);
}}
inna i=new inna();
i.a();
}
}

public class inn6{
public static void main(String args[]){
out6 a=new out6();
a.d();
}
}