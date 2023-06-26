import java.io.*;
public class f4{
public static void main(String args[])throws IOException{
File f=new File("dd11");
f.mkdir();
File f1=new File(f,"demomy.txt");
f1.createNewFile();
}
}