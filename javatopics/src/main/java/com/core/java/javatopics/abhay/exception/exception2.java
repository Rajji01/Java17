package com.core.java.javatopics.abhay.exception;

public class exception2 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String s=null;
        System.out.println(s.length());
    }
}
