public class arr10{

public static void main(String args[]){


int a[]=new int[]{1,2,3};	//only ref var assgnment is changing not the memory ex like for object
int b[]=new int[]{1};		// so size dosent matter only the type matters
b=a;


float []f1=new float[]{1.2f,1.3f,1.4f};
float []f2=f1;				//allowed
float []f3=new float[]{1.5f,1.6f,1.7f};
f2=f3;					//allowed
System.out.println(f2[0]);
f2=a;	//not allowed because in this case the types are not same but size is same but size is irrelevant 
}
}