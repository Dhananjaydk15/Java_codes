/*13. Develop a Java program to get a matrix and print the lower triangle of the matrix.
Apply the necessary conditions if it required.*/
import java.util.Scanner;
public class UpperTriangulerMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][], row, col;
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
        System.out.println("\t* Upper Trianguler matrix : ");
        for (int i = 0; i < row; i++) {
            System.out.println("");
            System.out.print("\t\t");
            for (int j = 0; j < col; j++){
                if (i > j){
                    if(arr[i][j]>10){
                        System.out.print(" ");
                    }
                    arr[i][j] = 0;
                    
                }
                System.out.print(" " + arr[i][j]);
            }
        }
        obj.close();
    }
}
