import java.io.*;
class dog implements Serializable{
String name="rajataa";
transient String pass="agraul";

private void writeObject(ObjectOutputStream os)throws Exception{
os.defaultWriteObject();
String epwd="123"+pass;
os.writeObject(epwd);
}

private void readObject(ObjectInputStream is)throws Exception{
is.defaultReadObject();
String epwd=(String)is.readObject();
pass=epwd.substring(4);
}

}

class c{
public static void main(String args[]) throws Exception{

dog d1=new dog();
FileOutputStream fos=new FileOutputStream("abc1.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(d1);
FileInputStream fos1=new FileInputStream("abc1.txt");
ObjectInputStream os1=new ObjectInputStream(fos1);
dog d2=(dog)os1.readObject();
System.out.println(d2.name);
System.out.println(d2.pass);
}
}