//in case of weak hashmap gc runs but in case of hashmap gc does not run
import java.util.*;
public class whmap{
public static void main(String args[]) throws Exception{
HashMap m =new HashMap();
Temp t=new Temp();
m.put(t,"durga");
System.out.println(m);
t=null;
System.gc();
Thread.sleep(5000);
System.out.println(m);
}
}

class Temp{
public String toString(){

return "temp";
}
public void finalize(){
System.out.println("finalize");
}
}