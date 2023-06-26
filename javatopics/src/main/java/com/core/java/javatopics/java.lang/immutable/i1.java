public class i1{


private int i;
i1(int i){this.i=i;}

public i1 modify(int i){
if(this.i==i){return this;}
else{return (new i1(i));}
}
public static void main(String args[]){
i1 c1=new i1(10);
 i1 c2=c1.modify(100);
i1 c3=c1.modify(10);
System.out.println(c1==c2);
System.out.println(c1==c3);
i1 c4=c1.modify(100);
System.out.println(c2==c4);


}

}