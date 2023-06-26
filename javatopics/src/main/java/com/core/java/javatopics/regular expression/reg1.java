import java.util.regex.*;
//end index is calculated as=end+1
public class reg1{
public static void main(String args[]){
int count=0;
Pattern p=Pattern.compile("\\W");
Matcher m=p.matcher("abba132#55ZASDbbba");
while(m.find()){
count++;
System.out.println(m.start()+"..."+m.end()+"...."+m.group());
}
System.out.println("Total no of occurences="+count);
}
}