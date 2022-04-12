import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no ;
        System.out.print("\t* Enter Array lenght :- ");
        no = obj.nextInt();
        System.out.print("\t* Enter The Element of Array :- ");
        int[] arr = new int[no];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ");
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
            max = arr[i];
        }
        int min = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
            min = arr[i];
        }
        System.out.println("\t* max value : "+ max);
        System.out.println("\t* min value : "+ min);
        obj.close();
    }
}
