//https://www.geeksforgeeks.org/lock-framework-vs-thread-synchronization-in-java/?ref=feed
//only child should not come after parent and other tahn this anything is possible
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class c{
public static void main(String args[]){
System.out.println("1");
try{ 

BufferedReader br = new BufferedReader(new FileReader("hello"));

}
//catch(ClassNotFoundException e){}
catch(IOException e){System.out.println("");}
catch(ArithmeticException e){}
catch(NullPointerException e){}
catch(StackOverflowError e){}


//catch(SQLException e){}
catch(Exception e){}
}
}