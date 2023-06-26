import java.io.*;
class dog implements Serializable{
int i=10;
transient int j=20;
}

class c{

public static void main(String args[]) throws Exception{
dog d1=new dog();
FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(d1);

FileInputStream fos1=new FileInputStream("abc.txt");
ObjectInputStream os1=new ObjectInputStream(fos1);
dog d2=(dog)os1.readObject();
System.out.println(d2.i);
System.out.println(d2.j);

}
}