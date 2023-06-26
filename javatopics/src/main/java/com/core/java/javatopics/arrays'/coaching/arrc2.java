public class arrc2
{
public static void s(int max[][]){

for(int []a:max){
System.out.println(a);
for(int a1:a)
System.out.println(a1);
}
}



public static void main(String args[])
{
arrc2.s(new int [][]{{1,2},{3}});
}
}