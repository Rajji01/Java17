
public class tlocal1{
public static void main(String args[]){
ThreadLocal tl=new ThreadLocal(){
public Object initialvalue(){return "abc";}
};

System.out.println(tl);				//null
tl.set("rajji");
System.out.println(tl);				//rajji
tl.remove();
System.out.println(tl);				//null(reinitialised to null)
}
}