public class arr1
{
public static void main(String args[])
{
int [][]x=new int[2][];

x[0]=new int[3];
x[1]=new int[4];

System.out.println(x.length);		//op=2
System.out.println(x[0].length);	//op=3
System.out.println(x[1].length);	//op=4

System.out.println(x[0][0]);		//op=0
}
}