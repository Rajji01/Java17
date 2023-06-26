//in inner claass this always represents
//outerClassName.this.x=-->10
//innerClassName.this.x=-->100

class inn2{
int x=10;

class o{
int x=100;
public void display(){
int x=1000;
System.out.println(x);			//1000
System.out.println(this.x);		//o.this.x==this.x ->100
System.out.println(inn2.this.x);	//10
} 
}
}

public class inn1{
public static void main(String args[]){
				//creation of outer class object
new inn2().new o().display();	//short

}
}