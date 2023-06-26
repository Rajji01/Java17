import java.io.*;

// when you dont know the order of serialized objects
class cat implements Serializable
{
rat r=new rat();
}


class dog implements Serializable
{
int i=20;
}


class rat implements Serializable
{
dog d=new dog();
}


class c
{

public static void main(String args[]) throws Exception{
cat c1=new cat();


System.out.println("serialization started");
FileOutputStream op=new FileOutputStream("n1.txt");
ObjectOutputStream oos= new ObjectOutputStream(op);
oos.writeObject(c1);


System.out.println("desirialization started");
FileInputStream ip=new FileInputStream("n1.txt");
ObjectInputStream ois= new ObjectInputStream(ip);
cat c2=(cat)ois.readObject();
System.out.println(c2.r.d.i);






}
}
 