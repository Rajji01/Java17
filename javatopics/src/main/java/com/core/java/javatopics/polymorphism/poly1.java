public class poly1{
public void s()
{
System.out.println("void");
}	

		
 int s(int a){System.out.println("int");return 2;}	//it is not compulsary to catch the return value of a fn
int s(int a,int b ){System.out.println("double");return 2;}
public static void main(String args[]){

poly1 p1=new poly1();
p1.s(2,2);



}
}