package com.core.java.javatopics.practice.codeDifference.july302023.question2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            StringBuilder sbr = new StringBuilder();
            char ar[][]= new char[8][8];
            HashMap<Integer,String> hm = new HashMap<>();
            hm.put(0,"");
            hm.put(1,"");
            hm.put(2,"");
            hm.put(3,"");
            hm.put(4,"");
            hm.put(5,"");
            hm.put(6,"");
            hm.put(7,"");
            for(int i=0;i<8;i++){
                String s= sc.next();
                for(int j=0;j<8;j++){
                    if(s.charAt(j)!='.'){
                        hm.put(j,hm.get(j)+""+s.charAt(j));
                    }
                }
            }
            String ans = IntStream.range(0,8).mapToObj(i->hm.get(i)).collect(Collectors.joining());
            System.out.println(ans);
        }
    }
}
