abstract class c1{ abstract void m1();
abstract void m2();
c1(){System.out.println("const of c1()");}
}
abstract class c2 extends c1{
void m1(){System.out.println("m1 defined by c1");}
abstract void m3();
c2(){System.out.println("const of c2()");}
}
 class c3 extends c2{
void m2(){System.out.println("m2 defined by c3");}
void m3(){System.out.println("m13defined by c3");}

c3(){System.out.println("const of c3()");}
}
public class ab  { 
public static void main(String args[]){
c3 a=new c3();
}
}
  