public class inn1{
class o{
public void display(){System.out.println("display");}
}
public static void main(String args[]){
inn1 i=new inn1();
inn1.o i1=i.new o();
i1.display();
}
}