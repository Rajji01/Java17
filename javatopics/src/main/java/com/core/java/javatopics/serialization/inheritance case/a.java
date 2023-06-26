import java.io.*;

class cat{
int j=20;
/*cat(){System.out.println("cat");}*/
//parent should cpmulsory contain no arg constructor
}

class dog extends cat implements Serializable{
int i=10;
dog(){System.out.println("dog");}
}

class c{
public static void main(String args[]) throws Exception{

dog d1=new dog();
d1.i=999;
d1.j=888;
FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(d1);

System.out.println("serialization");
FileInputStream fos1=new FileInputStream("abc.txt");
ObjectInputStream os1=new ObjectInputStream(fos1);
dog d2=(dog)os1.readObject();
System.out.println("deserialization");
System.out.println(d2.i);
System.out.println(d2.j);

}
}