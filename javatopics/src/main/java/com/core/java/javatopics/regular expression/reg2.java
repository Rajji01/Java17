import java.util.regex.*;
//end index is calculated as=end+1

public class reg2{
public static void main(String args[]){
int count=0;
Pattern p=Pattern.compile("\\s");
String[] s=p.split("rajat agrawal sir");

while(String s1:s){
System.out.println(s1);
}

}
}