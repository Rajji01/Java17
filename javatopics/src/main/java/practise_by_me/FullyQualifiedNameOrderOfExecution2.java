package practise_by_me;

public class FullyQualifiedNameOrderOfExecution2 {

    public static void main(String[] args) {
Date obj5 = new Date("user defined date class"); // user defined class will execute

        java.util.Date obj7 = new java.util.Date(); // util date class is accessible here
       // why it is throwing error if i am using string in date
        obj7.getTime();


    }
}
