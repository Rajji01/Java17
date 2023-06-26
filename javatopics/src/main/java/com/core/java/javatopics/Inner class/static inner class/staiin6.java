interface vehicles {
public int getnoofwheels();
class default1 implements vehicles{
public int getnoofwheels(){
return 2;
}
}
}
class bus implements vehicles{
public int getnoofwheels(){return 6;}
}
class staiin6{
public static void main(String args[]){
bus b=new bus();
System.out.println(b.getnoofwheels());
vehicles.default1 d=new vehicles.default1();
System.out.println(d.getnoofwheels());
} 
}