package com.core.java.javatopics.practice.codeDifference.july302023.question1;
import java.util.Scanner;
import java.util.stream.IntStream;

public class solStreamBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minimumDifference = IntStream.range(1, n)
                    .map(i -> arr[i] - arr[i - 1])
                    .min()
                    .orElse(Integer.MAX_VALUE);

            boolean isSorted = IntStream.range(1, n)
                    .allMatch(i -> arr[i] >= arr[i - 1]);

            System.out.println(!isSorted ? 0 : (minimumDifference / 2) + 1);
        }
    }
}