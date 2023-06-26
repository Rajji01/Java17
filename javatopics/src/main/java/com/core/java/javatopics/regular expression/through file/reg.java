import java.util.regex.*;
import java.io.*;
//end index is calculated as=end+1

public class reg{
public static void main(String args[]) throws IOException{
PrintWriter out=new PrintWriter("output.txt");
BufferedReader br=new BufferedReader(new FileReader("input.txt.txt"));

Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
String line=br.readLine();

while(line!=null){
Matcher m=p.matcher(line);

while(m.find()){
out.println(m.group());

}
line=br.readLine();

}
out.flush();
}
}