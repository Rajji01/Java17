//searches for it if found than refers it 
//if not found than it does not create the file
// it only creates the java file obj which will represents the name of the file 
//java file obj can also be used to represent dierectory
import java.io.*;
public class f1{
public static void main(String args[]) throws IOException{

File f=new File("abc00100.txt");
System.out.println(f.exists());
f.createNewFile();
System.out.println(f.exists());
}
}