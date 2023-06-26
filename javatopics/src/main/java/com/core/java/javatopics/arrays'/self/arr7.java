public class arr7{
static int return1(int ret[]){return ret[2];}
public static void main(String args[])
{
int k=arr7.return1(new int []{1,2,3});		//annonymous array passed to fn
System.out.println(k);

}
}