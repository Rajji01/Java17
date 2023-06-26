//cannot read a static var which is read idierectly write only state(RIWO)
//cannot peform dierect read when static var in RIWO state
//but can perform indierect only
class s3
{ 
int a;
static {
System.out.println(i);		//dierect read can not be performed
m1();				//indierect read	
}

public static void m1(){System.out.println(i);
System.out.println(new s3().a);	//o/p-->0
}//o/p-->0

static int i=10;

static {System.out.println("got that");} //static block



public static void main(String args[]){

    } 
} 