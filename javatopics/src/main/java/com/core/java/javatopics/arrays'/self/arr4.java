public class arr4
{
public static void main(String args[])
{
//whenever we try to print a ref var we get classname@hexadecimalcode
//when full size is defined


/*int x[]=new int[3];
System.out.println(x);*/		//ref var

/*int [][]x1=new int [2][3];
System.out.println(x1);			//ref var
System.out.println(x1[0]);		//ref var
System.out.println(x1[0][0]);*/		//value

int [][][]x2=new int [2][3][4];
System.out.println(x2);			//ref var
System.out.println(x2[0]);		//ref var
System.out.println(x2[0][1]);		//ref var
System.out.println(x2[0][1][1]);	//value


}
}