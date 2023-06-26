//object type casting
//compile checking 2 rules are present
//runtime 1 rule is present
//compile rules are applied
//but runtime is not
//thats why it gives claascastexception error

class t 
{ 
    public static void main(String args[]) 
                 
    { 
       Object o=new String("raj");
	StringBuffer s=(StringBuffer)o;
    } 
} 