package com.core.java.javatopics.abhay.interfaces;



public  class Child3 implements  Interface1, Interface2{
    @Override
    public void m1() {
        System.out.println("sop m1");
    }

    @Override
    public void m1(int a, int b) {

    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
//        Interface1.x=200;
        System.out.println(Interface1.x);
        System.out.println(Interface2.x);
        System.out.println(y);
    }


}
