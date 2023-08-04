package com.core.java.javatopics.practice.codeDifference.july312023;


import java.util.Arrays;
import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
//https://codeforces.com/problemset/problem/1846/C
        while(t-->0){
            int n =sc.nextInt();
            int m=sc.nextInt();
            int h =sc.nextInt();
            int ar[]= new int[n];
            for(int i =0;i<m;i++){
                int val=0;

                for(int j=0;j<n;j++){
                    ar[j]=sc.nextInt();

                }
                Arrays.sort(ar);
                for(int j=0;j<n;j++){
                    if(ar[j]+val<=h){

                    }
                }
            }
        }
    }


}