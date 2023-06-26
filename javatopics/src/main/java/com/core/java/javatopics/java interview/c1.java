//https://www.geeksforgeeks.org/lock-framework-vs-thread-synchronization-in-java/?ref=feed
//only child should not come after parent and other tahn this anything is possible

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Main{
void a()  
    {  
        try{  
        System.out.println("a(): Main called");  
        b();  
        }catch(Exception e)  
        {  
            System.out.println("Exception is caught");  
        }  
    }  
    void b() throws Exception  
    {  
     try{  
         System.out.println("b(): Main called");  
         c();  
     }catch(Exception e){  
		System.out.println("b's catch block");
         throw new Exception();  
     }  
     finally   
     {  
         System.out.println("finally block is called");  
     }  
    }  
    void c() throws Exception   
    {  
        throw new Exception();  
    }  
  
    public static void main (String args[])  
    {  
        Main m = new Main();  
        m.a();  
    }  
}
