interface l{
public void disp1(){}
interface l1{
public void disp2(){}
}
}
class test implements l{
public void disp1(){System.out.println("hello");}
}
class test1 implements l.l1{
public void disp2(){System.out.println("hii");}
}
public class staiin5{
public static void main(String args[]){
test t=new test();
t.disp1();
test t1=new tes();
t1.disp2();
}
}