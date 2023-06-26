public class Excep4{
public static void main(String [] args){
//try with multiple catch in child than parent order compiles successfully

System.out.println("hi");
try
{				//Risky code
System.out.println(10/0);
System.out.println("never");	//even when you are handling the exception this code will never be executed ok	
}


catch(ArithmeticException e)
{								//handler code
System.out.println("you can not divide any numbers by zero");		
}				

catch(Exception e)
{
System.out.println("default");	
}

}
}