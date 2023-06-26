//inner class can acces the static and non static data members
 class inn2{
int x=10;
static int y=20;
class o{
public void display(){System.out.println(x+"  "+y);}
}
}

public class inn1{
public static void main(String args[]){
				//creation of outer class object
new inn2().new o().display();	//short
;
}
}