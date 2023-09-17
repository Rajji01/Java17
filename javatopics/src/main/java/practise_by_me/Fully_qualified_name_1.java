package practise_by_me;
/*
import java.util.ArrayList; // more reliable way to import any class

public class Fully_qualified_name {
    public static void main(String[] args) {

        ArrayList<Integer> arl =new ArrayList<Integer>();
        System.out.println("fully Qualified name");


    }
}
*/


public class Fully_qualified_name_1 {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> arl =new java.util.ArrayList<Integer>(); // fully qualified name
        System.out.println("fully Qualified name");


    }
}