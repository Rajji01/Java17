 class inn3a{
class o1{
public void display(){System.out.println("display");}
}
}

public class inn3{
public static void main(String args[]){
		//creation of outer class object
inn3a.o1 i1=new inn3a().new o1();//short
i1.display();
}
}