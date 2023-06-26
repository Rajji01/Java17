//if you dont like cup cakes method only and there are 100 methodes
//than you can either use inheritance for permannet use
//but for temporary use you have to use annonymous class
//you can change it whenever you want

 class menu{

public void mcourse(){

System.out.println("cup cakes");
}
}
public class anno{
public static void main(String args[]){
menu m=new menu(){
public void mcourse(){
System.out.println("chocolate");
}

};
m.mcourse();
menu m1=new menu();
m1.mcourse();
menu m3=new menu(){
public void mcourse(){
System.out.println("ice cream");
}
};
m3.mcourse();
System.out.println(m.getClass().getName());
System.out.println(m1.getClass().getName());
System.out.println(m3.getClass().getName());

}
}