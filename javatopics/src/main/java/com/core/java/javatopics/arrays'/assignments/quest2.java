import java.util.Scanner;

public class quest2 {
		int z[];
		static int temp;
		static void sort(int []m)
			 {
				for(int i=0;i<m.length;i++)
				for(int j=i+1;j<m.length;j++){
				{if(m[i]>m[j]){
							System.out.println("before swapping "+m[i]+" "+m[j]+"for i="+i+"for j="+j);
							temp=m[i];
							m[i]=m[j];
							m[j]=temp;
							System.out.println("after swapping "+m[i]+" "+m[j]+"for i="+i+"for j="+j);
						}
					}
				}		

			}
			
		
		
	public static void main(String[] args) {
		quest2 o=new quest2();
		System.out.println("till this");
		int size=new Scanner(System.in).nextInt();
		o.z=new int[size];
		for(int i=0;i<o.z.length;i++)
		{
		o.z[i]=new Scanner(System.in).nextInt();	
		}
		quest2.sort(o.z);
		for(int x:o.z)
		{System.out.println(x+",");}
	}

}
