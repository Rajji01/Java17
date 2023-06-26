class c{int id;
String name;
c(int id,String name){
this.id=id;
this.name=name;
}
public String toString(){
return "name is ="+name+"  and roll no is ="+id;
}
public static void main(String args[]){
c c1=new c(1,"rajji");
c c2=new c(2,"agrawal");
System.out.println(c1);

System.out.println(c2);
}
}