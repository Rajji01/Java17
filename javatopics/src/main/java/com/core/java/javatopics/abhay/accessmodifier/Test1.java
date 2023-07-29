package com.core.java.javatopics.abhay.accessmodifier;

import com.core.java.javatopics.abhay.accessmodifier.subpackage1.Helper01;
import com.core.java.javatopics.abhay.accessmodifier.subpackage1.Helper02;
import com.core.java.javatopics.abhay.accessmodifier.subpackage1.MyString;
import java.sql.*;
//import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//import java.sql.Date;

//import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
public class Test1 {
//    static int MAX_VALUE=99;

    public static void main(String[] args) {
        java.util.ArrayList<Integer> arl = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> arl2 = new java.util.ArrayList<>();
        ArrayList<Integer> arl3= new ArrayList<>();
        Helper01 helper =new Helper01();
        Set<Integer> set = new HashSet<>();
        com.core.java.javatopics.abhay.accessmodifier.subpackage2.Helper01 helper02 = new com.core.java.javatopics.abhay.accessmodifier.subpackage2.Helper01();

        Date date = new Date("12");
//        date.getDate();
        date.print();
//        java.util.Date date1= new java.util.Date("12");

        System.out.println("");

        MyString.name.length();
        System.out.println(MAX_VALUE);
        Helper02 helper021 =new Helper02();
        System.out.println(helper021.val2);
    }
}

