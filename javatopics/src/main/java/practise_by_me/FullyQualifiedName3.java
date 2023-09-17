/*
package practise_by_me;
import java.sql.Date;
//import java.util.Date;

public class FullyQualifiedName3 {
    public static void main(String[] args) {
  Date obj = new Date(2,4,4);
java.util.Date obj2= new java.util.Date();
System.out.println("both date classes are working ");
    }
}
*/
/*
package practise_by_me;
//import java.sql.Date;
//import java.util.Date;

public class FullyQualifiedName3 {
    public static void main(String[] args) {
        //Date obj = new Date(2,4,4);
        //java.util.Date obj2= new java.util.Date();
Date obj = new Date("calling use defined date class");
    }
}
*/




package practise_by_me;
//import java.sql.Date;
import java.util.Date;

public class FullyQualifiedName3 {
    public static void main(String[] args) {

        java.util.Date obj2 = new java.util.Date();
        obj2.getTime();
        Date obj3 = new Date("calling use defined date class");// is it referring string ?
        obj3.getTime();


    }
}