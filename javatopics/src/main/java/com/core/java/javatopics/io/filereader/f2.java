import java.io.*;
public class f2{
public static void main(String args[]) throws IOException{
File f=new File("G:\\java\\io","abc.txt");
System.out.println(f.exists());
FileReader fr=new FileReader(f);
//return type of length method is long thats why we have to type cast it
char []ch=new char[(int)f.length()];
fr.read(ch);
for(char ch1:ch){System.out.print(ch1);}
}
}  