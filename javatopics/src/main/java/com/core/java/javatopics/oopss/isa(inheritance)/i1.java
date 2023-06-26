// is-a realtion ship==inheritance
// in java inheritance is implemented using extends keyword
//main advantage---->REUSABILITY
//if you want full functionality of the parent class than go for is-a
// if you want the part time functionality of the parent class then go for
//-->has a 
class parent{
public void p(){System.out.println("parent");}
}
class child extends parent{
public void c(){System.out.println("child");}
}
public class i1{
public static void main(String args[]){
child c1=new child();
c1.p();
c1.c();

parent p1=new parent();
p1.p();			//valid
p1.c();			// parent can call only its method

parent p2=new child();	//parent ref can hold child obj	but can call only parent methods
p2.p();			//valid
p2.c();			//invalid

child c2=new parent();//not allowed 
		      //ref of child cann not hol parent obj	

}
}