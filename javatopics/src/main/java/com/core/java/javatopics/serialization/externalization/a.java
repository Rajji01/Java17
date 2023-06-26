import java.io.*;
class dog implements Externalizable{
int i=20;
String s="rajay";
int j=200;

/*dog(String s,int i,int j){
this.i=i;
this.s=s;
this.j=j;
}*/

public dog(){
System.out.println("dog ");
}

public void writeExternal(ObjectOutput out) throws IOException{
out.writeObject(s);
out.writeInt(i);
}

public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
s=(String)in.readObject();
i=in.readInt();
}

}

class c{
public static void main(String args[]) throws Exception{

dog d1=new dog(/*"rajji",1,2*/);

FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(d1);

System.out.println("serialization");
FileInputStream fos1=new FileInputStream("abc.txt");
ObjectInputStream os1=new ObjectInputStream(fos1);

dog d2=(dog)os1.readObject();
System.out.println("deserialization");
System.out.println(d2.i);
System.out.println(d2.s);
System.out.println(d2.j);
}
}