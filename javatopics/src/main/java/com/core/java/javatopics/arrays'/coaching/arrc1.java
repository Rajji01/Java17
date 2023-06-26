public class arrc1{
//3d annonymous array through for each loop
public static void s(int max[][][]){
for(int [][] x:max){
System.out.println(x);
for(int []x1:x){
System.out.println(x1);
for(int x3:x1)
System.out.println(x3);
}
}
}
public static void main(String args[])
{

arrc1.s(new int [][][]{
			{{1,2},{3}}
			,{{4},{5}}

			});

}
}