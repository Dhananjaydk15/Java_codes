/*Design a Java program to get ‘n’ numbers and a number. Apply the linear search and binary
search. Find the best algorithm through the computation and display the result.*/
import java.util.Scanner;
public class SearchAlgo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.err.print("\t* Enter The Length of Array :- ");
        int no = obj.nextInt();
        int[] arr = new int[no];
        System.out.println("\t------------- :linear search: -------------");
        getdata(arr, no);
        System.out.print("\t* Enter The Element you want search by linear search : ");
        int key = obj.nextInt();
        System.out.println("\t* Element " + key + " is on index " + linear_search(arr, key));
        System.out.println("\t------------- :binary search: -------------");
        getdata(arr, no);
        System.out.print("\t* Enter The Element you want search by Binary search :  ");
        int key2 = obj.nextInt();
        System.out.println("\t* Element " + key2 + " is on index " + binary_search(arr, key2));
    }
    public static void getdata(int arr[], int no) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\t* Enter The Element of Array :- ");
        for (int i = 0; i < no; i++) {
            System.out.print(" ");
            arr[i] = obj.nextInt();
        }
        
    }
    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int binary_search(int arr[], int key) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int first, last, mid;
        first = 0;
        last = arr.length - 1;
        while (first <= last) {
            mid = (first + last) / 2;
            if (key == arr[mid])
            {
                return mid;
            }
            if (key > arr[mid])
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        return -1;
    }
}
