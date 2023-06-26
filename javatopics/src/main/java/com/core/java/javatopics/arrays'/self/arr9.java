public class arr9{

public static void main(String args[]){
char ch1='a';		//allowed
int i1=ch1;



/*char []c={'a','b','c'};		//not allowed
int i[]=c;*/

float f1=2.3f;			//allowed
double d1=f1;

/*float []f2={1.2f,1.3f};
double []d2=f2;	*/		//not allowed	


Object []o=new Object[1];		//allowed
o[0]=new String("rajji01");

String[] s1={"a","b"};		//allowed
Object []a1=s1; 		
System.out.println("hello1");
}
}