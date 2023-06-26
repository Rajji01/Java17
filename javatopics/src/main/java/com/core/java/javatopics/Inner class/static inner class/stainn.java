//inner class declared as static is known as static inner class
//in normal nested calass there is no chance of existing the inner claas obj without 
//outer class obect
//but in case of static nested class there maybe a chance of existing the inner class object
//without the outer class object
//same as that of instance var and static var or data members
public class stainn{
static class inn1{
public void show(){System.out.println("inn1");}
}

public static void main(String args[]){
inn1 i=new inn1();
i.show();
}
}