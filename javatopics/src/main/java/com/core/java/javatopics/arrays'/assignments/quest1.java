import java.util.*;
public class quest1
{
int z[];
		static int min(int []m){
		int temp=m[0];
			for(int i=0;i<m.length;i++){
		if(m[i]<temp){
		temp=m[i];}
		}	return temp;
			}
			


public static void main(String args[])
{

quest1 a=new quest1();
int size=new Scanner(System.in).nextInt();
int z[]=new int[size];
for(int i=0;i<z.length;i++)
{
z[i]=new Scanner(System.in).nextInt();
}
int mini=quest1.min(z);
System.out.println("minimum="+mini);

} 
}