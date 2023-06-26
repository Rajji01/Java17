import java.io.*;
public class f4{
public static void main(String args[]) throws IOException{
File f=new File("G:\\java\\io","aaa.txt");
System.out.println(f.exists());
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null){
System.out.println(line);
line=br.readLine();
}
br.close();
}
}