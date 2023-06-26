//abstract class const will be executed for every child class obj creation
//it is one because to nitialize the child class
abstract class pa{pa(){System.out.println("parent");}}
class ch extends pa{ ch(){System.out.println("child");}}
public class co{
public static void main(String args[]){
ch c=new ch();

}
}