import java.io.*;
public class f1{
public static void main(String args[]) throws IOException{
File f11=new File("ab.txt");
FileReader f=new FileReader(f11);
int i=f.read();
while(i!=-1){
System.out.print((char)i);
i=f.read();
}
}
}