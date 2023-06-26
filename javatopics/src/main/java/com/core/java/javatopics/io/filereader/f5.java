import java.io.*;
public class f5{
public static void main(String args[]) throws IOException{
File f=new File("G:\\java\\io","aaa.txt");
System.out.println(f.exists());
FileWriter fw=new FileWriter(f,true);
PrintWriter out=new PrintWriter(fw);
out.write(100);
out.println(100);
out.println(true);
out.println('c');
out.println("rajji bhai");
out.flush();
out.close();
}
}