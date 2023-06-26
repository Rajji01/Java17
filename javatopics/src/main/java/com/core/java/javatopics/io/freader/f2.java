import java.io.*;
public class f2{
public static void main(String args[]) throws IOException{
File f11=new File("ab.txt");
FileReader f=new FileReader(f11);
char []ch=new char[(int)f11.length()];//because length() ret type is long
				    //but the max size is int
f.read(ch);
for(char c:ch){System.out.println(c);}
}
}
