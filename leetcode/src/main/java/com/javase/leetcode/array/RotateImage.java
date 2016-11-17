package com.javase.leetcode.array;

/**
 * Created by DD240 on 2016/10/31.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        int matrix2[][]  = new int[matrix[0].length][matrix.length];
        for(int i=matrix.length - 1; i>=0; i--) {
            for(int j=0; j<matrix[i].length; j++) {
                // System.out.print(matrix[i][j] + " ");
                matrix2[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
    }

    public void rotateTwo(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<matrix.length / 2; i++) {
            swap(matrix[i], matrix[matrix.length - 1 - i]);
        }

        int tmp = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=i+1; j< matrix[i].length; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b= tmp;
    }

    public void swap(int[] a, int[] b) {
        int tmp = 0;
        for(int i = 0; i<a.length; i++) {
            tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
    }


}
