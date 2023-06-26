import java.io.*;
public class f10{
public static void main(String args[]) throws IOException{

PrintWriter pw=new PrintWriter("ab3.txt");
BufferedReader br=new BufferedReader(new FileReader("ab1.txt"));
String line=br.readLine(); 
while(line!=null){
pw.println(line);
line=br.readLine();
}
br=new BufferedReader(new FileReader("ab2.txt"));
line=br.readLine();
while(line!=null){
pw.println(line);
line=br.readLine();
}
pw.flush();
br.close();
pw.close();

}
}