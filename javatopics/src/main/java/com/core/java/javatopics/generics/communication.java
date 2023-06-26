//when generic obj is sent to non generic area it behaves as a non generic
import java.util.*;
public class communication{
 void nongeneric(ArrayList l){
l.add(1);
l.add(10.9);
l.add(true);
}
public static void main(String args[]){
ArrayList<String> l=new ArrayList<String>();
l.add("rajji");
l.add("pandey");
//l.add(1);
new communication().nongeneric(l);
System.out.println(l);

}
}