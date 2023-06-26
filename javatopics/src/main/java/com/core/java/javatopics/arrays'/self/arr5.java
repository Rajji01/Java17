public class arr5
{
public static void main(String args[])
{

//when full size is not defined


/*int x[]=new int[2];
System.out.println(x);
System.out.println(x[0]);
System.out.println(x[1]);*/

/*int []x1[]=new int [2][];
System.out.println(x1);
System.out.println(x1[0]);			//no ref present thats why null
System.out.println(x1[0].length);*/		//no ref present thats why can not apply method or access it gives run time error


int [][][]x2=new int[2][3][];
System.out.println(x2);
System.out.println(x2.length);
System.out.println(x2[0]);
System.out.println(x2[0].length);
System.out.println(x2[0][0]);			//no ref present
System.out.println(x2[0][0].length);		//thats why cannot use it ,apply method to it gives R.t error but compiles succesfully


}
}