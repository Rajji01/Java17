import java.io.*;
public class f3{
public static void main(String args[]) throws IOException{
File f=new File("G:\\java\\io","aaa.txt");
System.out.println(f.exists());
FileWriter fw=new FileWriter(f);
BufferedWriter bw=new BufferedWriter(fw);
char []ch={'a','b','c','d'};
bw.write(ch);
bw.newLine();
bw.write("rajjji boss");
bw.newLine();
bw.write("rocks");
bw.flush();
bw.close();
}
}