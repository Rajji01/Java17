//regular expresson s used to represnt a group of strings 
//according to a particular pattern
//various applications are
//compiler,interpreter
//validations
//circuit development

import java.util.regex.*;
public class rg{
public static void main(String args[]){
int count=0;
Pattern p=Pattern.compile("ab");
Matcher m=p.matcher("abbabbaba");
while(m.find()){
count++;
System.out.println(m.start()+"---"+m.end()+"----"+m.group());
}
System.out.println("the no. of occurences"+count);
}
}
