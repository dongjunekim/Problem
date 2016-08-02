package com.company;

public class Main {
    public Main() {
        int arr[] = new int[]{3, 8, 9, 7, 6};
        solution(arr, 3);

    }

    public int[] solution(int[] A, int K) {
        int temp;
        for (int j = 0; j < K; j++) {

            for (int i = A.length - 1; i > 0; i--) {
                temp = A[i - 1];
                A[i - 1] = A[i];
                A[i] = temp;
            }
        }//
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
        return A;
    }

    public static void main(String[] args) {
        new Main();
    }
}
