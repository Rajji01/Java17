package com.core.java.javatopics.abhay.accessmodifier.subpackage1;

public class MyString {
    public static String name="rajat";

    public String marks="";

    public String temp;
     public static int v1;
    public final String temp2;

    //constructor
    public MyString() {
//    temp2="abhay";
    }
    //instance block
    {
        temp2="abhay02";
    }

    public final static int v2;

    static{
        v2=29;
    }

    public static void main(String[] args) {
        int localVariable=0;
        final int localVariable2=0;
        Helper02 helper02 = new Helper02();
        System.out.println(name.length()+helper02.val3);
//        System.out.println(marks);
        System.out.println(new MyString().temp);
        System.out.println(v1);
        System.out.println(localVariable);
        System.out.println(localVariable2);
    }

    public static void main() {
        Helper02 helper02 = new Helper02();
        System.out.println(name.length()+helper02.val3);
//        System.out.println(marks);
    }
    public void prints(final int a){
        System.out.println(marks);
        System.out.println(name);
//        System.out.println();

    }
}
