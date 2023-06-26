import java.util.*;
public class st{



int z[];

public static void main(String args[])
{
st c=new st();
int size=new Scanner(System.in).nextInt();
c.z=new int[size];





for(int i=0;i<c.z.length;i++)
{
c.z[i]=new Scanner(System.in).nextInt();
}



for(int s:c.z){
System.out.println();
System.out.println(s);}

}
}