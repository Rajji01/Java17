class cat { int j;
cat(int j){this.j=j;}
}

class dog implements Cloneable{
cat c; 
int i;
dog(cat c,int i){
this.c=c;
this.i=i;}
public Object clone() throws CloneNotSupportedException{
return super.clone();
}
}
public class s{
public static void main(String args[]) throws CloneNotSupportedException{
cat c=new cat(2);
dog d1=new dog(c,10);
System.out.println(d1.i+"..."+d1.c.j);
dog d2=(dog)d1.clone();
d2.i=22;
d2.c.j=999;
System.out.println(d1.i+"..."+d1.c.j);
}
}
