import java.util.regex.*;
//end index is calculated as=end+1
public class reg{
public static void main(String args[]){
int count=0;
Pattern p=Pattern.compile("ab");
Matcher m=p.matcher("abbabbba");
while(m.find()){
count++;
System.out.println(m.start()+"..."+m.end()+"...."+m.group());
}
System.out.println("Total no of occurences="+count);
}
}