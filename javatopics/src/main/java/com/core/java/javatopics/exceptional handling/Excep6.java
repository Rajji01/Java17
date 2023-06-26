public class Excep6{
public static void main(String [] args){
//methods to print the exception
// 3
//a=printStackTrace()
//b=e.ToString()
//c=getMessage()

System.out.println("hi");
try   
{				//Risky code
System.out.println(10/0);
System.out.println("never");	//even when you are handling the exception this code will never be executed ok	
}


			
catch(ArithmeticException e)
{								
//e.printStackTrace();
//name,description,stacktrace(location)

//System.out.println(e.toString());		
//name,description

//System.out.println(e.getMessage());
//description
}	

}
}