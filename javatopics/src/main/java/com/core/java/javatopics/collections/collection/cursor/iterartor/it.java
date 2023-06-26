//iterator is a cursor
//advantages over enumerator
// iterator can not only read but also remove
// it is also a universal cursor
// disadvantages 
//can not perform addition
//only in single dierection

import java.util.*;
public class it{
public static void main(String args[]){
ArrayList l1=new ArrayList();
l1.add(1);
l1.add(2);
l1.add(3);
l1.add(4);
System.out.println(l1);
System.out.println(l1.get(3));
Iterator itr=l1.iterator();

while(itr.hasNext()){
Integer I=(Integer)itr.next();

if(I%2==0)
System.out.println(I);
else 
itr.remove();
}
System.out.println(l1);
}
}