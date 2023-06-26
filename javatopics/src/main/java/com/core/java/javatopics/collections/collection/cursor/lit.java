//listiterator
//child interg=face of ir=terattor
//uni dirn both forw and back
//can also add and repace
//listiterator is only applicable for list objects
//it is not universal cursor
/*methods are
hasNext
next
nextIndex

hasprevious
previous
previousIndex

 remove
 add
 set
*/
import java.util.*;
public class lit{
public static void main(String args[]){
LinkedList l1=new LinkedList();
l1.add("raj");
l1.add("rajji");
l1.add("rajat");
l1.add("agrawal");
System.out.println(l1);
ListIterator itr=l1.listIterator();

while(itr.hasNext()){
String s=(String)itr.next();
if(s.equals("raj"))
itr.remove();
else if(s.equals("rajji"))
itr.add("kabade");
else if(s.equals("rajat"))
itr.set("rajat will have gf after taking a job");
}
System.out.println(l1);
}
}