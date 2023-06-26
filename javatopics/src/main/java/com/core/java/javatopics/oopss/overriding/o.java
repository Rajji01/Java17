//good example
// in this example parent ref is having the child obj
// so it is comiple time binding
//hence compiler looks in parent
//but parent is having the private access so it is not accessible
//hence it is not present for object child hence it gives error
//hence no significance of presence of obj in child
class parent{
private void d(){System.out.println("hi");}
}

public class o extends parent{
public void d(){System.out.println("hello");}
public static void main(String args[]){

o o1=new o();
o1.d();
parent p=new o();
p.d();
}
}