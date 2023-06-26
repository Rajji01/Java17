public class Excep5{
public static void main(String [] args){
//try with multiple catch in child than parent order gives c.t error A.Excep has already been caught

System.out.println("hi");
try
{				//Risky code
System.out.println(10/0);
System.out.println("never");	//even when you are handling the exception this code will never be executed ok	
}


			

catch(Exception e)
{
System.out.println("default");	
}

catch(ArithmeticException e)
{								//no usage
System.out.println("you can not divide any numbers by zero");	// work already done by above parent	
}	

}
}