package com.core.java.javatopics.practice.codeDifference.july312023;


import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int index=-1;
            int value=Integer.MIN_VALUE;
            int n= sc.nextInt();
            for(int i=0;i<n;i++){
                int tempV=sc.nextInt();
                int quality=sc.nextInt();
                if(tempV<11&&quality>value){
                    value=quality;
                    index=i+1;
                }
            }
            System.out.println(index);
        }
    }


}