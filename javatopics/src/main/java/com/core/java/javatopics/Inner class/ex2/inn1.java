//inner class obj doesent exist without outer
//we cannot access directly inner
// so we cant have static data members in it
public class inn1{
class o{
public static void main(String args[]){
System.out.println("inside inner class");	//o/p error
}
}

}