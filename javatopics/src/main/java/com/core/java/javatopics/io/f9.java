import java.io.*;
//main disadvantages of file writer is that we have to insert line separator
//manually and in some systems \n is not considered as line separartor
//line separator differs from system to system
//true means append
class f9{
public static void main(String args[])throws IOException{
FileWriter fw=new FileWriter("abc1120.txt",true);
fw.write(100);
fw.write("durga\n softwarsolutions"); 
fw.write('\n');
char []ch1={'a','b','c'};
fw.write(ch1);
fw.write('\n');
fw.flush();
fw.close();
}
}