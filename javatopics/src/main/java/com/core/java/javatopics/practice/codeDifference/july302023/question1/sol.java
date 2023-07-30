package com.core.java.javatopics.practice.codeDifference.july302023.question1;

import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int previous=sc.nextInt();
            int minimumDifference= Integer.MAX_VALUE;
            boolean isSorted=true;
            for(int i=1;i<n;i++){
                int current= sc.nextInt();
                if(previous>current) isSorted=false;
                if(isSorted){
                    minimumDifference=Math.min(current-previous,minimumDifference);
                }
                previous=current;
            }
            System.out.println(!isSorted?0:(minimumDifference/2)+1);
        }
    }

}
