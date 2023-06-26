//cannot read a static var which is read idierectly write only state(RIWO)
//cannot peform dierect read when static var in RIWO state
//but can perform indierect only

class s2
{ 
int a;
static {
//System.out.println(i);	//dierect read
m1();				//indierect read	
}
public static void m1(){System.out.println(i);
}//o/p-->0
	static int i=10;
    	public static void main(String args[]){

    } 
} 