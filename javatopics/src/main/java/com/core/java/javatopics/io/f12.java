import java.io.*;
public class f12{
public static void main(String args[]) throws IOException{
PrintWriter pw=new PrintWriter("abn.txt");
File f=new File("G:\\java\\io\\dd");
System.out.println(f.exists());
String []s=f.list();
for(String s1:s){
BufferedReader br1=new BufferedReader(new FileReader(f,s1));
String line=br1.readLine();
while(line!=null){pw.println(line);
line=br1.readLine();
}
} 
pw.flush();
}
}