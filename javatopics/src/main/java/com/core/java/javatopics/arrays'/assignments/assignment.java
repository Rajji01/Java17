import java.util.*;
public class assignment
{
int z[];
		static int max(int []m){
		int temp=m[0];
			for(int i=0;i<m.length;i++){
		if(m[i]>temp){
		temp=m[i];}
		}	return temp;
			}
			


public static void main(String args[])
{

assignment a=new assignment();
int size=new Scanner(System.in).nextInt();
int z[]=new int[size];
for(int i=0;i<z.length;i++)
{
z[i]=new Scanner(System.in).nextInt();
}
int maxi=assignment.max(z);
System.out.println("maximum="+maxi);

}
}