//parent method is private hence it is not overriding
//so when parent ref is holding child object
//since it is not overriding  the compiler will look for method
//in parent class
class parent{private void m1(){System.out.println("parent");}}
class child extends parent{public  void m1(){System.out.println("child");}}
public class o6{
public static void main(String args[]){   
child c1=new child();
parent p=new child();
p.m1();

c1.m1();
}}