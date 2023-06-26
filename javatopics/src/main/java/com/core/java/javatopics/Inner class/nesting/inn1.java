//nesting of inneer class is possible
class innh{
class innm{
class innl{
public void display(){System.out.println("hi hello");}
}
}
}
public class inn1{
public static void main(String args[]){
innh i1=new innh();
innh.innm i2=i1.new innm();
innh.innm.innl i3=i2.new innl();
i3.display();

}
}