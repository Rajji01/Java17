//using instance it is easie to acces the inner class
public class inn1{
class o{
public void display(){System.out.println("display");}
}
public void call(){
o o1=new o();		// now we only need to create inner obj
o1.display();		//because we created outer obj and than called
			//display
}
public static void main(String args[]){
inn1 i=new inn1();
i.call();			//creation of outer class object
}
}