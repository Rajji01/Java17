//from outside the class
//without creating outer class object

class sta1{
static class inna{
public void show(){System.out.println("inn1");}
}


}
public class stainn2{
public static void main(String args[]){
sta1.inna i=new sta1.inna();
i.show();
}
}