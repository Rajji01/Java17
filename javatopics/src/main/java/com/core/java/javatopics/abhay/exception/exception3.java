package com.core.java.javatopics.abhay.exception;

import java.io.IOException;

public class exception3 {
    public static void main(String[] args) {
        try{
            String s =null;
            System.out.println("1");
//            System.out.println(10/0);
            s.length();
            System.out.println("3");
        }
        catch (Exception ex){
            System.out.println("4 =");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
        System.out.println("5");
    }
}
