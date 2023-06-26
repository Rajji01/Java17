//to count no. of dierectories
import java.io.*;
public class f6{
public static void main(String args[]){
/*
int count=0;
File f=new File("G:\\java\\io");
String []s=f.list();
for(String s1 :s){

File f2=new File(f,s1);
if(f2.isFile()){
System.out.println(s1);
count++;
}
}
System.out.println("the total number"+count);*/

File f=new File("G:\\java\\io");
String []s=f.list();
int count =0;
for(String s1:s){

File f2=new File(f,s1);
if(f2.isFile())
{
count++;
}
}
System.out.println("the total number"+count);
}
}