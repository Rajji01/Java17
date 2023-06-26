//to delete duplicates 
import java.io.*;
public class f14{
public static void main(String args[]) throws IOException{

PrintWriter pw=new PrintWriter("out1.txt");
BufferedReader br1=new BufferedReader(new FileReader("inp1.txt"));
String line=br1.readLine();
while(line!=null){
boolean avail=false;
BufferedReader br2=new BufferedReader(new FileReader("out1.txt"));
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
pw.flush();
}
line=br1.readLine();
}


}
}