/* 12. Design a Java Program to get a matrix as input and print the transpose of the given matrix.*/

import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][],row,col;
        System.out.print("\t* Enter The Row No.: ");
        row = obj.nextInt();
        System.out.print("\t* Enter The Coloum No.: ");
        col = obj.nextInt();
        arr = new int[row][col];
        System.out.println("\t* Enter The Matrix element : ");
        for (int i = 0; i < row; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < col; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        System.out.println("\t* Transpose Matrix : ");
        for (int i = 0; i < col; i++) {
            System.out.println("");
            System.out.print("\t\t");
            for (int j = 0; j < row; j++) {
               System.out.print(" "+arr[j][i]);
            }
        }
        obj.close();
    }
}
