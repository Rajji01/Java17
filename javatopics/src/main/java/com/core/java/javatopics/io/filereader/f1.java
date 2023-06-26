import java.io.*;
public class f1{
public static void main(String args[]) throws IOException{
File f=new File("G:\\java\\io","aaa.txt");
System.out.println(f.exists());
FileReader fr=new FileReader(f);
int i=fr.read();

while(i!=-1){
System.out.print((char)i);
i=fr.read();
}

}
}