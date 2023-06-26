import java.util.Scanner;

public class qu2 {
		int z[];
		static int max(int []m) {
			int temp=0;
			temp = m[0];
			for(int i=0;i<m.length;i++) {
				
				if((m[i]>m[++i]))
				{}
				else {temp=m[i];}
			}
			return temp;
			}
		
	public static void main(String[] args) {
		qu1 o=new qu1();
		System.out.println("till this");
		int size=new Scanner(System.in).nextInt();
		o.z=new int[size];
		for(int i=0;i<o.z.length;i++)
		{
		o.z[i]=new Scanner(System.in).nextInt();	
		}
		int maximum=qu1.max(o.z);
		System.out.println("maximum="+maximum);
	}

}
