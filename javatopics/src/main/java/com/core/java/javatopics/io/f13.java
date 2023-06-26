//to extract files
import java.io.*;
public class f13{
public static void main(String args[]) throws IOException{

PrintWriter pw=new PrintWriter("out2.txt");
BufferedReader br1=new BufferedReader(new FileReader("inp2.txt"));
String line=br1.readLine();
while(line!=null){
boolean avail=false;
BufferedReader br2=new BufferedReader(new FileReader("del.txt"));
String target=br2.readLine();
while(target!=null){
if(line.equals(target)){
avail=true;
break;
}
target=br2.readLine();
}
if(avail==false){
pw.println(line);
}
line=br1.readLine();
}
pw.flush();

}
}