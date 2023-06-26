//overriding concept is not applicable for variables
//var resolution is done by compler on ref type

class pa{int a=11;}
class ch extends pa{int a=99;}
public class o5
{ 
    public static void main(String args[]) 
                 
    { 
       pa p=new pa();
	System.out.println(p.a); //11
	ch c1 =new ch();
	System.out.println(c1.a);//99
	pa p2=new ch();
	System.out.println(p2.a);//11 done by parent ref 
    } 
} 