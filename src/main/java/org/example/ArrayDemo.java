package org.example;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args){

        // 1D array
//        int[] rollno = new int[5];
//
//        rollno[0] = 5;
//        rollno[3] = 4;
//
//        for (int i = 0; i < 5; i++){
//           System.out.println(rollno[i]) ;
//        }

        // 2D array
        int[][] matrix = new int[5][2];

        matrix[0][0] = 1;
        matrix[2][1] = 2;

//        for(int i = 0; i<5; i++){
//            for(int j=0; j<2; j++){
//                System.out.println(matrix[i][j]);
//            }
//        }

//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j<matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        for(int[] row : matrix){
//            for (int val : row){
//                System.out.print(val+ "\t");
//            }
//            System.out.println();
//        }

        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
