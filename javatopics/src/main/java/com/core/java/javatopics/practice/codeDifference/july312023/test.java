package com.core.java.javatopics.practice.codeDifference.july312023;

import java.util.*;

class test {
    public static void main(String[] args) {
      System.out.println( firstNonRepeatingCharacter("abcdcaf"));
    }
    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        char ar[]=new char[26];

        for(int i=0;i<string.length();i++){
            ar[string.charAt(i)-'a']+=1;

        }
        for(int i=0;i<string.length();i++){
            if(ar[string.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static int firstNonRepeatingCharacter2(String string) {
        char ar[]=new char[26];
        ArrayList<Character> arl = new ArrayList<>();
        ArrayList<Integer> arl2 = new ArrayList<>();
        for(int i=0;i<string.length();i++){
            int indx=string.charAt(i)-'a';
            if(ar[indx]==0){
               arl.add(string.charAt(i));
               arl2.add(i);
            }
            ar[indx]+=1;
        }
        for(int i=0;i<arl.size();i++){
            if(ar[arl.get(i)-'a']==1) return arl2.get(i);
        }
        return -1;
    }
}
