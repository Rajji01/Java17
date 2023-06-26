public class arr2
{
public static void main(String args[])
{
int [][][]x=new int[2][][];

x[0]=new int[3][];
x[1]=new int[5][];

x[0][0]=new int [3];
x[0][1]=new int [6];
x[0][2]=new int [8];

x[1][0]=new int [2];
x[1][1]=new int [3];
x[1][2]=new int [4];
x[1][3]=new int [5];
x[1][4]=new int [6];
System.out.println(x.length);		//op=2

System.out.println(x[0].length);	//op=3
System.out.println(x[1].length);	//op=5

System.out.println(x[0][1].length);	//op=6
System.out.println(x[1][3].length);	//op=5


}

}