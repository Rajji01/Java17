//java file obj ect can also be usde to create dierectory

import java.io.*;
public class f3{
public static void main(String args[])throws IOException{

File f=new File("gjgjgu111.txt");
System.out.println(f.exists());
f.mkdir();
System.out.println(f.exists());


}
}