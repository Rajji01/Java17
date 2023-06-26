
//cannot reduce scope
//return type must be same
//in overrriding
//but this case was upto 1.4 version
//from 1.5 versin covarient types are also allowed
//for object types only not primitives
//and it is applied in same one(in parent) or its child(in child)
class parent3{
protected Object d(){System.out.println("hi");
return new Object();
}
}

public class o4 extends parent3{
protected String d(){System.out.println("hello");
return "hello";}
public static void main(String args[]){
}
}