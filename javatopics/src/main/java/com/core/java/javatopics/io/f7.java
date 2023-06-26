import java.io.*;
public class f7 {
public static void main(String args[]){
int count=0;
File f=new File("G:\\java\\io");
String []s=f.list();
for(String s1 :s){System.out.println(s1);
count++;}
System.out.println("the total number"+count);
}
}