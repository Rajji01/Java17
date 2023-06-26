class d{
static {System.out.println("1");
	disp();}


	static void disp() {System.out.println("3");}
	//static int var=2;
	static {System.out.println("2");}

{System.out.println("bye1");}

int a=2;

{System.out.println("bye22"+a);}

d(){System.out.println("bye33");}


}
public class this1 extends d{
static {System.out.println("1");
	disp();}
	static void disp() {System.out.println("3"+var);}
	static int var=2;
	static {System.out.println("2");}


{System.out.println("hi1");}

int a=2;

{System.out.println("hi2"+a);}

this1(){System.out.println("hi3");}

public static void main(String args[]){

this1 t=new this1();
System.out.println("hi4");

}
}