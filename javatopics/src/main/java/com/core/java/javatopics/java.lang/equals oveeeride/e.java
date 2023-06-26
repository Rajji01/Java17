public class e{
int roll;
String name;

e(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public boolean equals(Object obj)
{try{
int roll1=this.roll;
String name1=this.name;
e en=(e)obj;
int roll2=en.roll;
String name2=en.name;
if(roll1==roll2&&name1.equals(name2))
return true;
else
return false;
}
catch(NullPointerException e){return false;}
catch(ClassCastException e){return false;}
}


public static void main(String args[]){
e e1=new e(1,"raj");
e e2=new e(2,"rajji");
e e3=new e(1,"raj");
e e4=new e(2,"rajji");
System.out.println(e1.equals(e2));
System.out.println(e1.equals(e3));
System.out.println(e2.equals(e3));
System.out.println(e2.equals(e4));
System.out.println(e2.equals("nn"));
}
}