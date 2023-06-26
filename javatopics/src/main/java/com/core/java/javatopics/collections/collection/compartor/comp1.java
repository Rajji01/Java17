import java.util.*;
public class comp1{
public static void main(String args[]){

TreeSet t=new TreeSet(new mycomp());
t.add(10);
t.add(0);
t.add(15);
t.add(5);
t.add(20);
System.out.println(t);


}
}


class mycomp implements Comparator{
public int compare(Object ob1,Object ob2){
Integer i1=(Integer)ob1;
Integer i2=(Integer)ob2;
if(i1<i2)
return +1;
else if(i1>i2)
return -1;
else
return 0;
}



}