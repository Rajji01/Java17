package practise_by_me;
import java.util.Date;
public class FullyQualifiedNameOrderOfExecution3 {
    public static void main(String[] args) {

        Date obj5 = new Date(); // here  user defined Date class will not work
        // becuase you have explicitly imported the  util.Date class
        obj5.getTime();

        java.util.Date obj6 = new java.util.Date(); // util date class is accessible here
        obj6.getTime(); //util date class method will be accessible
    }
}
