import java.io.*;

// when you dont know the order of serialized objects
class cat implements Serializable
{
int i=22;
int j=33;
}


class dog implements Serializable
{
int i=20;
int j=30;
}


class rat implements Serializable
{
int i=2200;
int j=3300;
}


class c
{

public static void main(String args[]) throws Exception{
cat c1=new cat();
rat r1=new rat();
dog d1=new dog();

System.out.println("serialization started");
FileOutputStream op=new FileOutputStream("n1.txt");

ObjectOutputStream oos= new ObjectOutputStream(op);

oos.writeObject(c1);
oos.writeObject(r1);
oos.writeObject(d1);

System.out.println("desirialization started");
FileInputStream ip=new FileInputStream("n1.txt");

ObjectInputStream ois= new ObjectInputStream(ip);
Object o=ois.readObject();

if(o instanceof cat){
cat c2=(cat)o;
System.out.println(c2.j);
}
else if(o instanceof rat){
rat r2=(rat)o;
System.out.println(r2.j);
}
else if(o instanceof dog){
dog d2=(dog)o;
System.out.println(d2.j);
}

Object o1=ois.readObject();
if(o1 instanceof cat){
cat c2=(cat)o1;
System.out.println(c2.j);
}
else if(o1 instanceof rat){
rat r2=(rat)o1;
System.out.println(r2.j);
}
else if(o1 instanceof dog){
dog d2=(dog)o1;
System.out.println(d2.j);
}


Object o2=ois.readObject();
if(o2 instanceof cat){
cat c2=(cat)o2;
System.out.println(c2.j);
}
else if(o2 instanceof rat){
rat r2=(rat)o2;
System.out.println(r2.j);
}
else if(o2 instanceof dog){
dog d2=(dog)o2;
System.out.println(d2.j);
}


}
}
 