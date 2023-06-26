

public class inn2{
class o{
public void display(){System.out.println("display");}
}


}
public cclass inn1{
public static void main(String args[]){
inn2 i=new inn2();		//creation of outer class object
inn2.o i1=i.new o();
i1.display();
}
}