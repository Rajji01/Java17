import java.io.*;
class f8{
public static void main(String args[])throws IOException{
FileWriter fw=new FileWriter("abc.txt",true);
fw.write(100);
fw.write("durga\n softwarsolutions"); 
fw.write('\n');
char []ch1={'a','b','e'};
fw.write(ch1);
fw.write('\n');
fw.flush();
fw.close();
}
}