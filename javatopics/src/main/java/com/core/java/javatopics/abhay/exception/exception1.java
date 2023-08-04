package com.core.java.javatopics.abhay.exception;

public class exception1 {
    public static void main(String[] args) throws Exception {
        System.out.println();
        v2();
        System.out.println("1");
    }
    public static void v1() throws Exception {
        System.out.println("v1    ");
        throw new Exception();

    }
    public static void v2() throws Exception {
        try {
            System.out.println("v2   ");
            throw new Exception("age should be greater than 18");

        }
        catch(Exception ex){
          System.out.println("exception occured "+ex.getMessage());
          ex.printStackTrace();
        }
        System.out.println("23231");
    }
}
