//to merge data of two files line by line
import java.io.*;
public class f11{
public static void main(String args[]) throws IOException{
PrintWriter pw=new PrintWriter("ab33.txt");
BufferedReader br1=new BufferedReader(new FileReader("ab11.txt"));
BufferedReader br2=new BufferedReader(new FileReader("ab22.txt"));
String line1=br1.readLine(); 
String line2=br2.readLine();
while(line1!=null||line2!=null){
if(line1!=null){pw.println(line1);
line1=br1.readLine();
}
if(line2!=null){pw.println(line2);
line2=br2.readLine();
}
}
pw.flush();
br1.close();
br2.close();
pw.close();
}
}