//data hiding
//so thTat outside person can not acces our data dierectly 
//without validation he can not acces our data dierectly
//data hiding provides security
//we can implementdata hiding by private keyword
// i have bank account
// iam a valid member of bank
//though i can not access others account
 class bank{
 private int accno=2;
public int valid(String a){
if(a=="rajat")
return accno;
else 
return 0;
}
}
public class d{
public static void main(String args[]){
bank k=new bank();
//System.out.println(k.accno);
int a=k.valid("rajji");
int b=k.valid("rajat");
System.out.println(a);
System.out.println(b);
}
}