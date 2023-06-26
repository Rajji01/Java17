public class arr8{

public static void main(String args[]){
//1st array
float a[]=new float[5];
a[0]=2.3f;
a[1]=1;				//float array can take values of int,byte ,short ,char
a[2]='a';
byte b=2;
a[3]=b;
short s=9;
a[4]=s;

//2nd array
int a1[]=new int[2];
a1[0]=1;
a1[1]=2;

//universal method
/*for(int i=0;i<a.length;i++)
{			
System.out.println(a[i]);
}*/


for( double z:a)
{				//if array type is float than it cannot be downcasted into int,byte,short,char
System.out.println(z);		//only in case of for each loop
}

for( int q:a1)			//if array is of int type than int can not be downcasted in case of
{				//in case of for each only
System.out.println(q);
}


}
}