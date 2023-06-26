import java.io.*;
public class f5{
public static void main(String args[])throws IOException{

/*File f=new File("G:\\java\\io","aaa.txt");
f.createNewFile();
System.out.println(f.exists());*/

File f1=new File("001ab");
System.out.println(f1.exists());
f1.mkdir();
System.out.println(f1.exists());
File f2=new File("G:\\java","001abc001");
f2.createNewFile();
System.out.println(f2.exists());
}
}