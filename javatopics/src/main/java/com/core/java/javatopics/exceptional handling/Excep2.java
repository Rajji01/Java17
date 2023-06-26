public class Excep2{
public static void main(String [] args){

/*System.out.println("hi");
System.out.println("hello");		//normal termination
System.out.println("bye bye");*/

System.out.println("hi");
System.out.println(10/0);		//abnormal termination
System.out.println("bye bye");		//default exception handler prints the excep and terminates the prog
					//compiles because it is unchecked excep

}
}